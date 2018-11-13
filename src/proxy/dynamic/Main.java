package proxy.dynamic;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        View widget = new Widget();
        ViewInvocationHandler handler = new ViewInvocationHandler(widget);
        View proxyInstance = (View) Proxy.newProxyInstance(
                widget.getClass().getClassLoader(),
                widget.getClass().getInterfaces(),
                handler);
//        proxyInstance.click();
        proxyInstance.touch();

        View view = ViewProxy.newProxyInstance(widget);
        view.click();
    }
}
