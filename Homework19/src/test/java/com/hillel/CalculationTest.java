package com.hillel;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculationTest {
    int variable1 = 10;
    int variable2 = 5;
    private static Calculation calculation;

    @BeforeClass
    public static void init() {
        calculation = new Calculation();
    }

    @Test
    public void testDiff() throws Exception {
        int expectedResult = 5;
        int result = calculation.calc(variable1, variable2, '-');
        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void testMult() throws Exception {
        int expectedResult = 50;
        int result = calculation.calc(variable1, variable2, '*');
        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void testDiv() throws Exception {
        int expectedResult = 2;
        int result = calculation.calc(variable1, variable2, '/');
        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void testExpectedException() {
        Assert.assertThrows(Exception.class, () -> calculation.calc(variable1, variable2, '!'));
    }
}
