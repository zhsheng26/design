package iteration;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        DiningRoomA diningRoomA = new DiningRoomA();
        Iterator<IMenu> iteratorA = diningRoomA.createIterator();
        print(iteratorA);
        DiningRoomB diningRoomB = new DiningRoomB();
        Iterator<IMenu> iteratorB = diningRoomB.createIterator();
        print(iteratorB);
    }

    private static void print(Iterator<IMenu> iterator) {
        while (iterator.hasNext()) {
            IMenu next = iterator.next();
            next.description();
        }
    }
}
