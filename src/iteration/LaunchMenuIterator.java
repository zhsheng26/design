package iteration;

import java.util.Iterator;

public class LaunchMenuIterator implements Iterator<IMenu> {
    private final IMenu[] menus;
    private int position = 0;

    public LaunchMenuIterator(IMenu[] menus) {
        this.menus = menus;
    }

    @Override
    public boolean hasNext() {
        return position != menus.length && menus[position] != null;
    }

    @Override
    public IMenu next() {
        IMenu menu = menus[position];
        position = position + 1;
        return menu;
    }
}
