package forSale;

public class Amplifier extends Item{
    String type;

    public Amplifier(String name, int priceBought, int priceSold, String type) {
        super(name, priceBought, priceSold);
        this.type = type;
    }
}
