package iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
    private final Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    /*
        전체 메뉴를 공개하지 않는다.
        내부의 구체적인 구조를 노출하지 않고, 인터페이스를 통해 간접적인 접근을 제공함으로
        최소 지식의 원칙을 지켜야 한다.
     */
    @Deprecated
    public Map<String, MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
