package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ViewInvocationHandler implements InvocationHandler {
    private final View view;

    public ViewInvocationHandler(View view) {
        this.view = view;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----start----");
        if (method.getName().equals("click")) {
            System.out.println("perform click before");
        }
        Object invoke = method.invoke(view, args);
        System.out.println("----end-----");
        return invoke;
    }
}
