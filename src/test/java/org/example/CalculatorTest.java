package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testPower() {
        assertEquals(9.0, Calculator.power(2, 3), 0.0001);
        assertEquals(1.0, Calculator.power(2, 0), 0.0001);
        assertEquals(0.25, Calculator.power(2, -2), 0.0001);
    }

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, Calculator.squareRoot(16), 0.0001);
        assertEquals(0.0, Calculator.squareRoot(0), 0.0001);

        try {
            Calculator.squareRoot(-1);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            assertEquals("Error! Square root of a negative number.", e.getMessage());
        }
    }

    @Test
    public void testLogarithm() {
        assertEquals(Math.log(2), Calculator.logarithm(2), 0.0001);
        assertEquals(0.0, Calculator.logarithm(1), 0.0001);

        try {
            Calculator.logarithm(0);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            assertEquals("Error! Logarithm of zero or negative number.", e.getMessage());
        }
    }

    @Test
    public void testFactorial() {
        assertEquals(120.0, Calculator.factorial(5), 0.0001);
        assertEquals(1.0, Calculator.factorial(0), 0.0001);
        assertEquals(1.0, Calculator.factorial(1), 0.0001);

        try {
            Calculator.factorial(-3);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            assertEquals("Error! Factorial of a negative number is undefined.", e.getMessage());
        }
    }
}