package seven;

import java.util.ArrayList;
import java.util.List;

public class Safe {
    private List<Item> bestItems;
    private int maxVolume;
    private double bestPrice;

    public Safe(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    private double calcVolum(List<Item> items) {
        double sumVolume = 0;
        for (Item i : items) {
            sumVolume += i.volume;
        }
        return sumVolume;
    }

    private double calcPrice(List<Item> items) {
        double sumPrice = 0;
        
        for (Item i : items) {
            sumPrice += i.price;
        }

        return sumPrice;
    }

    private void isBestList(List<Item> items) {
        if (bestItems == null) {
            if (calcVolum(items) <= maxVolume) {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        } else {
            if (calcVolum(items) <= maxVolume && calcPrice(items) > bestPrice) {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        }
    }

    public void makeAllSets(List<Item> items) {
        if (!items.isEmpty())
            isBestList(items);
        
        for (int i = 0; i < items.size(); i++) {
            List<Item> newSet = new ArrayList<Item>(items);
            newSet.remove(i);
            makeAllSets(newSet);
        }

    }

    public List<Item> getBestList() {
        return bestItems;
    }
}
