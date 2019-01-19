import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(4, 3);
        Assert.assertEquals(7, result);
    }

    @Test
    public void testAddition1() {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 15);
        Assert.assertEquals(25, result);
    }
}