package com.hillel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculationParametrixedTest {
    private static Calculation calculation;

    @BeforeAll
    public static void init() {
        calculation = new Calculation();
    }

    @ParameterizedTest
    @MethodSource("getValues")
    @DisplayName("test sum a+b")
    public void testSumm(int a, int b, char operation, int expectedResult) throws Exception {
        int actualResult = calculation.calc(a, b, operation);
        Assertions.assertEquals(expectedResult, actualResult);
    }


    public static Stream<Arguments> getValues() {
        return Stream.of(
                Arguments.of(2, 3, '+', 5),
                Arguments.of(4, 10, '+', 14),
                Arguments.of(5, 5, '+', 10)
        );
    }
}
