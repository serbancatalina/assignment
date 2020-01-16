import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExchangeTest {
    private Exchange exchange;

    @Before
    public void setUp() {
        exchange = new Exchange("nyse");
    }

    @Test
    public void calculateTest() {
        assertEquals("NYSE", exchange.getUpperCaseSymbol());
    }
}
