package edu.pnu.badcalc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test

    void testAdd() {

        Calculator c = new Calculator();

        assertEquals(5, c.add(2, 3));

    }

    @Test

    void testSubtract() {

        Calculator c = new Calculator();

        assertEquals(1, c.subtract(5, 4));

    }

    @Test

    void testMultiply() {

        Calculator c = new Calculator();

        assertEquals(6.09, c.multiply(2.9, 2.1), 0.0001);

    }

    @Test

    void testDivide() {

        Calculator c = new Calculator();

        assertEquals(2, c.divide(6, 3));

    }

    @Test

    void testDivideByZero() {

        Calculator c = new Calculator();

        assertEquals(Double.POSITIVE_INFINITY, c.divide(10, 0));

    }

    @Test

    void testFactorial() {

        Calculator c = new Calculator();

        assertEquals(24, c.factorial(4));

    }

    @Test

    void testParseAndCompute() {

        Calculator c = new Calculator();

        assertEquals(5, c.parseAndCompute("2 + 3"));

    }

}
 