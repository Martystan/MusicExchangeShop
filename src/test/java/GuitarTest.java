import forSale.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("electric guitar", 50, 100, "wooden", "red", 6);
    }

    @Test
    public void canPlay(){
        assertEquals("twang,twang,twang", guitar.play());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(50, guitar.calculateMarkUp());
    }

}
