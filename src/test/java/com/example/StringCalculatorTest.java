package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    // Empty String Return
    @Test
    public void testEmptyString() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    // Single Number Check
    @Test
    public void testSingleNumber() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
    }

    // Add Multiple Numbers
    @Test
    public void testMultipleNumbers() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(10, calculator.add("1,2,3,4"));
    }

    // Inline Delimeter
    @Test
    public void testNewLineDelimiter() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1\n2,3"));
    }

    // Custom Delimeter
    @Test
    public void testCustomDelimiter() throws Exception {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("//;\n1;2"));
    }

    // Negative TestCase 
    @Test(expected = Exception.class)
    public void testNegativeNumber() throws Exception {
        StringCalculator calculator = new StringCalculator();
        calculator.add("-1,2");
    }

    // Multiple Negative Numbers
    @Test(expected = Exception.class)
    public void testMultipleNegativeNumbers() throws Exception {
        StringCalculator calculator = new StringCalculator();
        calculator.add("-1,-2,3");
    }
}