import forSale.Drum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void before(){
        drum = new Drum("drum", 30, 70, "metal", "grey", true);
    }

    @Test
    public void canPlay(){
        assertEquals("dam,dam,dam,dam", drum.play());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(40, drum.calculateMarkUp());
    }
}
