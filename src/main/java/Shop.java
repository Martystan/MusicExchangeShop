import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock =  new ArrayList<>();
    }

    public void addToStock(ISell item){
        this.stock.add(item);
    }

    public int numberOfStockItems(){
        return this.stock.size();
    }

    public void removeFromStock(ISell item){
        this.stock.remove(item);
    }
    
    public int calculatePotentialProfit(){
        int potentialProfit = 0;
        for (ISell item: this.stock) {
            potentialProfit += item.calculateMarkUp();}
            return potentialProfit;

        
    }
}
