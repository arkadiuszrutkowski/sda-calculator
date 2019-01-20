import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorAssertJTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSubtractionWithoutAssertJ() {
        // when
        int result = calculator.subtract(6, 2);

        // then
        Assert.assertEquals(4, result);
        Assert.assertTrue(result > 0);
        Assert.assertTrue(result > 3);
    }

    @Test
    public void testSubtractionWithAssertJ() {
        // when
        int result = calculator.subtract(6, 2);

        // then
        assertThat(result)
                .isEqualTo(4)
                .isPositive()
                .isGreaterThan(3);
    }
}
