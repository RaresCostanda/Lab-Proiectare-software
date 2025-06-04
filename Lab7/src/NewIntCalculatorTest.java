//package ro.ulbs.paradigme.lab6.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewIntCalculatorTest {

    @Test
    void testAdd() {
        // Arrange
        NewIntCalculatorTest calc = new NewIntCalculatorTest();

        // Act
        int result = calc.add(5, 3);

        // Assert
        assertEquals(8, result);
    }

    @Test
    void testSubtract() {
        NewIntCalculatorTest calc = new NewIntCalculatorTest();
        int result = calc.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    void testMultiply() {
        NewIntCalculatorTest calc = new NewIntCalculatorTest();
        int result = calc.multiply(6, 7);
        assertEquals(42, result);
    }

    @Test
    void testDivideValid() {
        NewIntCalculatorTest calc = new NewIntCalculatorTest();
        int result = calc.divide(20, 5);
        assertEquals(4, result);
    }

    @Test
    void testDivideByZero() {
        NewIntCalculatorTest calc = new NewIntCalculatorTest();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });
    }
}
