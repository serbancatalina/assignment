import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MovingAverageCalculatorTest {
    private MovingAverageCalculator movingAverageCalculator;

    @Before
    public void setUp() {
        movingAverageCalculator = new MovingAverageCalculator();
    }

    @Test
    public void calculateTest() {
        assertEquals(5, movingAverageCalculator.calculate(Arrays.asList(1, 5, 10, 4, 5)), 0f);
    }
}
