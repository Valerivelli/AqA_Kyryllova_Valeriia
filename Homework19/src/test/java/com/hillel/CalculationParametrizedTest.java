package com.hillel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculationParametrizedTest {
    private static Calculation calculation;

    @BeforeClass
    public static void init() {
        calculation = new Calculation();
    }

    @Test
    @Parameters({"variable1", "variable2", "operation"})
    public void sum(int variable1, int variable2, char operation) throws Exception {
        System.out.println(calculation.calc(variable1, variable2, operation));
    }

}
