package pl.sda.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void shouldAddTwoNumbers() {
        int result = calculator.add(2, 2);
        Assert.assertEquals(4, result);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        int result = calculator.subtract(5, 3);
        Assert.assertEquals(2, result);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        int result = calculator.multiply(3, 2);
        Assert.assertEquals(6, result);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        int result = calculator.divide(14, 2);
        Assert.assertEquals(7, result);
    }
}


