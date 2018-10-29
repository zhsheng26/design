package subscibe;

import java.util.Observable;

public class MenuObservable extends Observable {
    private String menu;

    public String getCurrentMenu() {
        return menu;
    }

    void clickMenu(String menu) {
        this.menu = menu;
        setChanged();
        notifyObservers(menu);
    }

}
