package comp1110.labtest2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Pubudu Dissanayake on 8/30/15.
 * Project : comp1110-labtest2
 */
public class Shop {
    ArrayList<StoreItem> itemsInStock = new ArrayList<>();
    int total;

    public void addItem(String name, int stock, int price) {
        itemsInStock.add(new StoreItem(name, stock, price));
    }

    public int totalStockValue() {
        for (StoreItem storeItem : itemsInStock) {
                total = total + storeItem.getPrice() * storeItem.getStock();
        }
        return total;
    }

    public void addItem(String name, int stock, int price, int rate, int reOrderDays) {
        itemsInStock.add(new StoreItem(name, stock, price, rate, reOrderDays));

    }

    public HashMap reorder() {
        HashMap<String, Integer> reOrderHashMap = new HashMap<>();
        for (StoreItem storeItem : itemsInStock) {
            if (storeItem.getReOrderDate() > 2) {
                int reOrder = storeItem.getRate() * 7 - storeItem.getStock();
                if (reOrder > 2) {
                    reOrderHashMap.put(storeItem.getName(), reOrder);
                }
            }
        }
        return reOrderHashMap;
    }
}

class StoreItem {
    private String name;
    private int stock;
    private int price;
    private int rate;
    private int reOrderDate;

    public StoreItem(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public StoreItem(String name, int stock, int price, int rate, int reOrderDate) {
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.rate = rate;
        this.reOrderDate = reOrderDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getReOrderDate() {
        return reOrderDate;
    }

    public void setReOrderDate(int reOrderDate) {
        this.reOrderDate = reOrderDate;
    }
}