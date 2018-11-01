package single;

public class Singleton {
    private Singleton() {
    }

    private static volatile Singleton instance = null;

    public Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
