package forSale;

public class Drum extends Instrument{
    boolean sticksIncluded;

    public Drum(String name, int priceBought, int priceSold, String material, String colour, boolean sticksIncluded) {
        super(name, priceBought, priceSold, material, colour);
        this.sticksIncluded = sticksIncluded;
    }



    public String play() {
        return "dam,dam,dam,dam";
    }
}
