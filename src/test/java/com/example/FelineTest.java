package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class FelineTest {

    @Test
    public void getFamilyReturnCatFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();

        assertEquals("Кошачьи", actual);
    }

    @Test
    public void getKittensWithoutParameterReturnOne() {
        Feline feline = new Feline();
        int actual = feline.getKittens();

        assertEquals(1, actual);
    }

    @Test
    public void getKittensWithParameterReturnKittensCount() {
        Feline feline = new Feline();
        int actual = feline.getKittens(5);

        assertEquals(5, actual);
    }
    @Test
    public void eatMeatReturnPredatorFood() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expected, actual);
    }
}
