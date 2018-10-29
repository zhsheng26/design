package tactics;

public class RocketDuck extends Duck {

    public RocketDuck(String name, String color, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(name, color, flyBehavior, quackBehavior);
    }

    public RocketDuck(String name, String color) {
        super(name, color);
    }

    @Override
    public void display() {
        System.out.println(getColor() + getName() + "鸭：");
        performFly();
        performQuack();
    }
}
