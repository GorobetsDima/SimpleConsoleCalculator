package GorobetsDmitriy;
/**
 * @author Gorobets Dmitriy
 *         <p>
 *         It's test  for add method
 */

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;


@RunWith(value = Parameterized.class)
public class AddMethodTest {
    private double pass_value1;
    private double pass_value2;
    private double expected_result;
    private double delta;
    private Calculator calc;


    @Parameterized.Parameters
    public static Collection set_of_parameters() {
        return Arrays.asList(new Object[][]{
                {10, 5, 5, 0},
                {-10, -5, -5, 0},
                {0, -5, 5, 0},
                {0, 5, -5, 0},
                {15.3, 11.1, 4.2, 0},
                {0, 0, 0, 0}});
    }

    public AddMethodTest(double expected_result, double pass_value1, double pass_value2, double delta) {
        this.expected_result = expected_result;
        this.pass_value1 = pass_value1;
        this.pass_value2 = pass_value2;
        this.delta = delta;
    }

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void tatIncrementParametrized() {
        assertEquals(expected_result,calc.add(pass_value1, pass_value2), delta);
    }


}



