package proxy.dynamic;


import java.lang.reflect.Proxy;

public class ViewProxy {
    public static View newProxyInstance(View view) {
        ViewInvocationHandler handler = new ViewInvocationHandler(view);
        return (View) Proxy.newProxyInstance(
                view.getClass().getClassLoader(),
                view.getClass().getInterfaces(),
                handler);
    }
}
