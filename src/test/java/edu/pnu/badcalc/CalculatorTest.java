package edu.pnu.badcalc;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CalculatorTest {
   @Test
   void testAdd() {
       Calculator c = new Calculator();
       assertEquals(5.0, c.add(2, 3));
   }
   @Test
   void testSubtract() {
       Calculator c = new Calculator();
       assertEquals(1.0, c.subtract(5, 4));
   }
   @Test
   void testMultiply() {
       Calculator c = new Calculator();
       assertEquals(6.0, c.multiply(2, 3));
   }
   @Test
   void testDivide() {
       Calculator c = new Calculator();
       assertEquals(2.0, c.divide(6, 3));
   }
   @Test
   void testDivideByZero() {
       Calculator c = new Calculator();
       assertEquals(Double.POSITIVE_INFINITY, c.divide(10, 0));
   }
   @Test
   void testFactorial() {
       Calculator c = new Calculator();
       assertEquals(120, c.factorial(5));
   }
   @Test
   void testParseAdd() {
       Calculator c = new Calculator();
       assertEquals(5.0, c.parseAndCompute("2 + 3"));
   }
   @Test
   void testParseSubtract() {
       Calculator c = new Calculator();
       assertEquals(1.0, c.parseAndCompute("5 - 4"));
   }
   @Test
   void testParseMultiply() {
       Calculator c = new Calculator();
       assertEquals(6.0, c.parseAndCompute("2 * 3"));
   }
   @Test
   void testParseDivide() {
       Calculator c = new Calculator();
       assertEquals(2.0, c.parseAndCompute("6 / 3"));
   }
}