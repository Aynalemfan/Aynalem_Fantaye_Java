package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void setUp() throws Exception {
        Calculator calculator = new Calculator();
    }

    @Test
    public void shouldReturnAdditionOfTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2,6);
        int expectedResult = 8;
        assertEquals(8, result);

    }

    @Test
    public void shouldReturnSubtractionOfTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(12,8);
        int expectedResult = 4;
        assertEquals(4, result);
    }

    @Test
    public void shouldReturnMultiplicationOfTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2,6);
        int expectedResult = 12;
        assertEquals(12, result);
    }

    @Test
    public void shouldReturnDivisionOfTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(12,6);
        int expectedResult = 2;
        assertEquals(2, result);
    }
//Double
    @Test
    public void shouldReturnAdditionOfTwoDoubles() {
        Calculator calculator = new Calculator();
        double result = calculator.add(7.9,2.5);
        double expectedResult = 10.4;
        double delta = 0;
        assertEquals(expectedResult, result, delta);
    }

    @Test
    public void shouldReturnSubtractionOfTwoDoubles() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(15.3, 3.5);
        double expectedResult = 11.8;
        double delta = 0;
        assertEquals(expectedResult, result, delta);;

    }

    @Test
    public void shouldReturnMultiplicationOfTwoDoubles() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(15.3, 3.5);
        double expectedResult = 53.550000000000004;
        double delta = 0;
        assertEquals(expectedResult, result, delta);

    }

    @Test
    public void shouldReturnDivisionOfTwoDoubles() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(4.5, 2.5);
        double expectedResult = 1.8;
        double delta = 0;
        assertEquals(expectedResult, result, delta);
    }
}