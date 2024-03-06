package iterator;

import java.util.*;

public class DinnerMenu implements Menu {
    private final List<MenuItem> menuItems = new ArrayList<>();

    public DinnerMenu() {
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    /*
        전체 메뉴를 공개하지 않는다.
        내부의 구체적인 구조를 노출하지 않고, 인터페이스를 통해 간접적인 접근을 제공함으로
        최소 지식의 원칙을 지켜야 한다.
     */
    @Deprecated
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
