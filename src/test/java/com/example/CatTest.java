package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import  java.util.List;

public class CatTest {

    @Test
    public void getSoundReturnMeow() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);

        String actual = cat.getSound();

        assertEquals("Мяу", actual);
    }

    @Test
    public void getFoodReturnPredatorFood() throws Exception{
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> actual = cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expected, actual);
    }
}
