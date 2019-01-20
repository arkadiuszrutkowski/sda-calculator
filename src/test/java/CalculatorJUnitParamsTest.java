import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

// Pokaz biblioteki JUnitParams. Porównajcie sobie z CalculatorParameterizedTest.
// Szczególnie pod kątem konfiguracji testów.
@RunWith(JUnitParamsRunner.class)
public class CalculatorJUnitParamsTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Parameters({"2, 2, 4", "10, 3, 13", "2, 5, 7"})
    @Test
    public void testAddition(int a, int b, int expected) {
        // when
        int result = calculator.add(a, b);

        // then
        Assert.assertEquals(expected, result);
    }
}
