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
       assertEquals(6.09, c.multiply(2.9, 2.1), 0.0001);
   }
   @Test
   void testDivideNormal() {
       Calculator c = new Calculator();
       assertEquals(2.0, c.divide(6, 3));
   }
   @Test
   void testDivideByZero() {
       Calculator c = new Calculator();
       assertEquals(Double.POSITIVE_INFINITY, c.divide(10, 0));
   }
   @Test
   void testFactorialBasic() {
       Calculator c = new Calculator();
       assertEquals(120, c.factorial(5));
   }
   @Test
   void testFactorialZero() {
       Calculator c = new Calculator();
       assertEquals(1, c.factorial(0));
   }
   @Test
   void testFactorialNegative() {
       Calculator c = new Calculator();
       assertEquals(1, c.factorial(-4));
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
       assertEquals(6.09, c.parseAndCompute("2.9 * 2.1"), 0.0001);
   }
   @Test
   void testParseDivide() {
       Calculator c = new Calculator();
       assertEquals(2.0, c.parseAndCompute("6 / 3"));
   }
   @Test
   void testParseInvalidOp() {
       Calculator c = new Calculator();
       assertEquals(0.0, c.parseAndCompute("5 ^ 2"));
   }
}