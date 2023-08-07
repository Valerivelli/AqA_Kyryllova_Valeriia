package com.hillel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculationTest {
    int variable1 = 10;
    int variable2 = 5;

    private static Calculation calculation;

    @BeforeAll
    public static void init() {
        calculation = new Calculation();
    }

    @Test
    public void testSum() throws Exception {
        int expectedResult = 15;
        int result = calculation.calc(variable1, variable2, '+');
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testDiff() throws Exception {
        int expectedResult = 5;
        int result = calculation.calc(variable1, variable2, '-');
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testMult() throws Exception {
        int expectedResult = 50;
        int result = calculation.calc(variable1, variable2, '*');
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testDiv() throws Exception {
        int expectedResult = 2;
        int result = calculation.calc(variable1, variable2, '/');
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testExpectedException() throws Exception {
        Assertions.assertThrows(Exception.class,
                () -> calculation.calc(variable1, variable2, '?'),
                "Invalid operation!");
    }
}
