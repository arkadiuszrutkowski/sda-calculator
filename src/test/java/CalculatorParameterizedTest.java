import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

// Testowanie paramtryzowane z użyciem Parameterized JUnit.
// Porównajcie sobie z CalculatorJUnitParamsTest. Szczególnie pod kątem
// konfiguracji testów.
@RunWith(Parameterized.class)
public class CalculatorParameterizedTest {

    private Calculator calculator;

    private final int a, b, expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, 2, 4}, {4, 5, 9}, {10, 3, 13}
        });
    }

    public CalculatorParameterizedTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        // when
        int result = calculator.add(a, b);

        // then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSubtraction() {
        // when
        int result = calculator.subtract(5, 2);

        // then
        Assert.assertEquals(3, result);
    }
}