import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MaxValueCalculatorTest {
    private MaxValueCalculator maxValueCalculator;

    @Before
    public void setUp() {
        maxValueCalculator = new MaxValueCalculator();
    }

    @Test
    public void calculateTest() {
        assertEquals(10, maxValueCalculator.calculate(Arrays.asList(1, 5, 10, 4, 5)));
    }
}
