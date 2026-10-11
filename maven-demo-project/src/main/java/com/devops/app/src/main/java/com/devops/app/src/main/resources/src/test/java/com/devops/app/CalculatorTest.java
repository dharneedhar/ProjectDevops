package com.devops.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(30, calculator.add(10, 20));
    }

    @Test
    void testSubtraction() {
        assertEquals(10, calculator.subtract(20, 10));
    }

    @Test
    void testMultiplication() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    void testDivision() {
        assertEquals(4, calculator.divide(20, 5));
    }

    @Test
    void testDivideByZero() {

        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
        );
    }
}
