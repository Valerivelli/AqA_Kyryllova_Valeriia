package com.hillel;

import com.hillel.Calculation;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculationSumTestPositive {
    int variable1 = 10;
    int variable2 = 5;
    private static Calculation calculation;

    @BeforeClass
    public static void init() {
        calculation = new Calculation();
    }

    @Test
    public void testSum() throws Exception {
        int expectedResult = 15;
        int result = calculation.calc(variable1, variable2, '+');
        Assert.assertEquals(result, expectedResult);
    }
}
