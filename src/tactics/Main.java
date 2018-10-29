package tactics;

public class Main {

    public static void main(String[] args) {
        Duck duck = new RocketDuck("火箭", "红色");
        duck.setFlyBehavior(new RocketFlyBehavior());
        duck.display();
    }
}
