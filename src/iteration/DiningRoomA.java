package iteration;

import java.util.ArrayList;
import java.util.Iterator;

public class DiningRoomA implements IRooM {
    private ArrayList<IMenu> dinnerMenus;

    public DiningRoomA() {
        this.dinnerMenus = new ArrayList<>();
        this.dinnerMenus.add(new LunchMenu("菜单1"));
        this.dinnerMenus.add(new LunchMenu("菜单2"));
        this.dinnerMenus.add(new LunchMenu("菜单3"));
    }

    @Override
    public Iterator<IMenu> createIterator() {
        return dinnerMenus.iterator();
    }
}
