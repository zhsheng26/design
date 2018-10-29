package tactics;

public class DefaultQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("普通鸭子叫声");
    }
}
