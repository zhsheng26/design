package decorator;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new NormalCoffee();
        coffee = new SweetDecorator(coffee);
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> " + coffee.cost());

    }
}
