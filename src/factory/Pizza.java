package factory;

public abstract class Pizza {

    public void cut() {
        System.out.println("切片");
    }

    public void hot() {
        System.out.println("加热");
    }

    public void serve() {
        System.out.println("上菜");
    }

    public abstract void description();
}
