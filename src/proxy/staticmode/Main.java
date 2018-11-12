package proxy.staticmode;

public class Main {
    public static void main(String[] args) {
        ViewProxy proxy = new Widget().getProxy();
        proxy.setEnable(false);
        proxy.click();
    }
}
