package seven;

import java.util.ArrayList;
import java.util.List;

public class Seven {

    private List<Item> items;
    public Seven() {
        items = new ArrayList<>();
    }

    private void addItems() {
        items.add(new Item("Лампа", 4, 300));
        items.add(new Item("Глобус", 5, 100));
        items.add(new Item("Марки", 2, 200));
        items.add(new Item("Золото", 3, 400));
        items.add(new Item("Шкатулка", 2, 500));
    }

    private static void showItems(List<Item> listItems) {
        if (listItems != null) {
            for (Item i : listItems) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    private void solve(int maxCost) {
        Safe safe = new Safe(maxCost);
        safe.makeAllSets(items);
        List<Item> solve = safe.getBestList();

        if (solve == null) {
            System.out.println("Решение не найдено!");
        } else {
            showItems(solve);
            System.out.println("Решение найдено!");
        }
    }

    public void setMaxValue(int maxValue) {
        addItems();
        System.out.println("Максимальный объем сейфа: "+maxValue);
        solve(maxValue);
    }
}
