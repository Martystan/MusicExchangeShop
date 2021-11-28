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
}
