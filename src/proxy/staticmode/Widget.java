package proxy.staticmode;

public class Widget implements View {

    private ViewProxy proxy;

    public ViewProxy getProxy() {
        proxy = new ViewProxy(this);
        return proxy;
    }

    @Override
    public void click() {
        if (isProxy()) {
            if (proxy.isEnable()) {
                System.out.println("hello,what is wrong?");
            } else {
                System.out.println("代理不让见你");
            }
        } else {
            System.out.println("不要找我，请找代理");
        }
    }

    private boolean isProxy() {
        return this.proxy != null;
    }
}
