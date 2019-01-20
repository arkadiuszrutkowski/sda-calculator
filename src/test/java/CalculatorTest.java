import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {

    private Calculator calculator;
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        // when
        int result = calculator.add(4, 5);

        // then
        Assert.assertEquals(9, result);
    }

    // Sprawdzanie wyjątków - @Test#expected
    @Test(expected = ArithmeticException.class)
    public void testArithmeticException() {
        // given
        int a = 4;
        int b = 0;

        // when
        int result = calculator.divide(a, b);
    }

    // Sprawdzanie wyjątków - try/catch
    @Test
    public void testArithmeticException1() {
        // given
        int a = 4;
        int b = 0;
        int result = -1;

        // when
        try {
            result = calculator.divide(a, b);
        } catch (ArithmeticException exception) {
            // then
            Assert.assertEquals("/ by zero", exception.getMessage());
        }
        Assert.assertEquals(-1, result);
    }

    // Sprawdzanie wyjątków - ExpectedException @Rule
    @Test
    public void testArithmeticException2() {
        // given
        int a = 4;
        int b = 0;
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("/ by zero");

        // when
        int result = calculator.divide(a, b);
    }
}