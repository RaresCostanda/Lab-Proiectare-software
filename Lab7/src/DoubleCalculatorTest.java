//package ro.ulbs.paradigme.lab6.util;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class DoubleCalculatorTest  {

    @Test
    void testAdd() {
        DoubleCalculatorTest calc = new DoubleCalculatorTest();
        double result = calc.add(5.5, 3.2);
        assertEquals(8.7, result, 0.0001);
    }

    @Test
    void testSubtract() {
        DoubleCalculatorTest calc = new DoubleCalculatorTest();
        double result = calc.subtract(10.5, 4.2);
        assertEquals(6.3, result, 0.0001);
    }

    @Test
    void testMultiply() {
        DoubleCalculatorTest calc = new DoubleCalculatorTest();
        double result = calc.multiply(2.5, 4.0);
        assertEquals(10.0, result, 0.0001);
    }

    @Test
    void testDivideValid() {
        DoubleCalculatorTest calc = new DoubleCalculatorTest();
        double result = calc.divide(9.0, 3.0);
        assertEquals(3.0, result, 0.0001);
    }

    @Test
    void testDivideByZero() {
        DoubleCalculatorTest calc = new DoubleCalculatorTest();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10.0, 0.0);
        });
    }
}

