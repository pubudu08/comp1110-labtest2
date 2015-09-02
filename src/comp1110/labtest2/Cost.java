package comp1110.labtest2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Pubudu Dissanayake on 8/31/15.
 * Project : comp1110-labtest2
 */
public class Cost {
    HashMap<String, Item> ITEM_MAP = new HashMap<>();

    public void addItem(String name, int cost) {

            ITEM_MAP.put(name, new Item(name, cost));

    }

    public void printCost() {
        List<Item> itemList = new ArrayList<>(ITEM_MAP.values());
        Collections.sort(itemList);
        for (int x = itemList.size() - 1; x > -1; x--) {
            System.out.println(itemList.get(x).toString());
        }
    }


}

class Item implements Comparable<Item> {
    String name;
    int cost; // in cents

    public Item(String n, int c) {
        name = n;
        cost = c;
    }

    public String toString() {
        return name + " " + cost;
    }

    @Override
    public int compareTo(Item item) {
        int a;
        if ((item.cost - cost )!= 0) {
            a = item.cost - cost;
        } else {
            a = (item.name.compareTo(name));
        }
        return a;
    }
}
