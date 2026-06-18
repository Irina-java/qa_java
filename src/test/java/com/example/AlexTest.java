package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlexTest {

    @Test
    public void getFriendsReturnAlexFiends() throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex(feline);

        List<String> actual = alex.getFriends();
        List<String> expected = List.of("Марти", "Глория", "Мелман");

        assertEquals(expected, actual);
    }
    @Test
    public void getPlaceOfLivingReturnNewYorkZoo() throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex(feline);

        String actual = alex.getPlaceOfLiving();

        assertEquals("Нью-Йоркский зоопарк", actual);
    }
    @Test
    public void getKittensReturnZero() throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex(feline);

        int actual = alex.getKittens();

        assertEquals(0, actual);
    }
    @Test
    public void doesHaveManeReturnTrue() throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex(feline);

        boolean actual = alex.doesHaveMane();

        assertTrue(actual);
    }
}
