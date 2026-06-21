package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final boolean expectedHasMane;

    public LionParameterizedTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }
    @Parameterized.Parameters
    public static Object[][] detTestData() {
        return new Object[][]{
            {"Самец", true},
            {"Самка", false}
        };
    }
    @Test
    public void doesHaveManeReturnExpectedResult() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);

        boolean actual = lion.doesHaveMane();

        assertEquals(expectedHasMane, actual);
    }

}
