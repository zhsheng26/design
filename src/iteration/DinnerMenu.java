package iteration;

public class DinnerMenu implements IMenu {

    private final String name;

    public DinnerMenu(String name) {
        this.name = name;
    }

    @Override
    public void description() {
        System.out.println(name);
    }
}
