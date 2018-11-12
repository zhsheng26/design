package proxy.staticmode;

public class ViewProxy implements View {
    private final View view;
    private boolean enable = true;

    public ViewProxy(View view) {
        this.view = view;
    }

    @Override
    public void click() {
        System.out.println("点击控件之前");
        this.view.click();
        System.out.println("点击控件之后");
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
