package forSale;

import behaviours.ISell;

public abstract class Item  implements ISell {

    String name;
    int priceBought;
    int priceSold;

    public Item(String name, int priceBought, int priceSold) {
        this.name = name;
        this.priceBought = priceBought;
        this.priceSold = priceSold;
    }

    public String getName() {
        return name;
    }

    public int getPriceBought() {
        return priceBought;
    }

    public int getPriceSold() {
        return priceSold;
    }

    public int calculateMarkUp() {
        int markUp = priceSold -= priceBought;
        return markUp;
    }



}
