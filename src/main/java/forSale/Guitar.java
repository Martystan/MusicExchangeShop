package forSale;

public class Guitar extends Instrument{

    int numberOfStrings;

    public Guitar(String name, int priceBought, int priceSold, String material, String colour, int numberOfStrings) {
        super(name, priceBought, priceSold, material, colour);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }



    public String play() {
        return "twang,twang,twang";
    }
}
