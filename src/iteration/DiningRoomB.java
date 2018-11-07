package iteration;

import java.util.Iterator;

public class DiningRoomB implements IRooM {
    private static final int LENGTH = 4;
    private IMenu[] launch;

    public DiningRoomB() {
        this.launch = new IMenu[LENGTH];
        launch[0] = new DinnerMenu("晚餐0");
        launch[1] = new DinnerMenu("晚餐1");
        launch[2] = new DinnerMenu("晚餐2");
        launch[3] = new DinnerMenu("晚餐3");
    }

    @Override
    public Iterator<IMenu> createIterator() {
        return new LaunchMenuIterator(launch);
    }
}
