package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;


public class LionTest {


    @Test
    public void constructorWithInvalidSexThrowsException() {
        Feline feline = new Feline();
        try {
        new Lion("Неправильный пол", feline);
    } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
        }

    @Test
    public void getKittensReturnOne() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();

        assertEquals(1, actual);
    }

    @Test
    public void getFoodReturnPredatorFood() throws Exception {
        Feline feline = mock(Feline.class);

        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        when(feline.getFood("Хищник")).thenReturn(expected);
        Lion lion = new Lion("Самец", feline);
        List<String> actual = lion.getFood();

        assertEquals(expected, actual);
    }
}
