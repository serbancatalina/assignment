import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class InstrumentTest {
    private Instrument instrument;

    @Before
    public void setUp() {
        instrument = new Instrument();
    }

    @Test
    public void calculateTest() {
        String expectedInstrId = "instrument-1";
        instrument.setId("instrument-1");
        assertTrue(expectedInstrId.equals(instrument.getId()));
    }
}
