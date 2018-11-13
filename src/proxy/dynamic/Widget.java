package proxy.dynamic;

public class Widget implements View {

    @Override
    public void click() {
        System.out.println("click");

    }

    @Override
    public void touch() {
        System.out.println("touch");
    }
}
