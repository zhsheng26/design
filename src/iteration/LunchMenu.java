package iteration;

public class LunchMenu implements IMenu {
    private final String name;

    public LunchMenu(String name) {
        this.name = name;
    }

    @Override
    public void description() {
        System.out.println("午餐：" + name);
    }
}
