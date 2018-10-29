package subscibe;

public class Main {
    public static void main(String[] args) {
        MenuObservable observable = new MenuObservable();
        for (int i = 0; i < 4; i++) {
            PageObserver pageObserver = new PageObserver("page" + i);
            observable.addObserver(pageObserver);
        }
        observable.clickMenu("主页");
    }
}
