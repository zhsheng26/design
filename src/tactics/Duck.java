package tactics;

public abstract class Duck {
    private String name;
    private String color;
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    protected Duck(String name, String color, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.name = name;
        this.color = color;
        this.flyBehavior = flyBehavior == null ? new DefaultFlyBehavior() : flyBehavior;
        this.quackBehavior = quackBehavior == null ? new DefaultQuackBehavior() : quackBehavior;
    }

    protected Duck(String name, String color) {
        this(name, color, null, null);
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
