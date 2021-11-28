import behaviours.ISell;
import forSale.Amplifier;
import forSale.Drum;
import forSale.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Drum drum;
    Amplifier amplifier;
    ISell guitar1;


    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar("bass", 80, 90, "aluminium", "black", 6);
        drum = new Drum("bongo", 40, 50, "leather", "blue", false);


    }

    @Test
    public void checkStockStartsEmpty(){
        assertEquals(0, shop.numberOfStockItems());
    }

    @Test
    public void canAddItemsToStock(){
        shop.addToStock(guitar);
        assertEquals(1,shop.numberOfStockItems());
    }
}

