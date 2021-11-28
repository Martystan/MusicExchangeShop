package forSale;

import behaviours.IPlay;

public abstract class Instrument extends Item implements IPlay {

    String material;
    String colour;

    public Instrument(String name, int priceBought, int priceSold, String material, String colour) {
        super(name, priceBought, priceSold);
        this.material = material;
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }


}
