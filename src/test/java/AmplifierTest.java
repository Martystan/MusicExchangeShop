import forSale.Amplifier;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmplifierTest {
    Amplifier amplifier;

    @Before
    public void before(){
        amplifier = new Amplifier("stereo amplifier", 100, 90, "Yamaha");
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(-10, amplifier.calculateMarkUp());
    }
}
