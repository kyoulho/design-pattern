package iterator;

import java.util.ArrayList;
import java.util.List;

public class Witness {
    private final List<Menu> menus;

    public Witness(CafeMenu cafeMenu, DinnerMenu dinnerMenu) {
        menus = new ArrayList<>();
        menus.add(cafeMenu);
        menus.add(dinnerMenu);
    }

    public void printMenu() {
        for (Menu menu : menus) {
            menu.createIterator().forEachRemaining(System.out::println);
        }
    }
}
