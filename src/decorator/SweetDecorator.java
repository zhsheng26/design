package decorator;

public class SweetDecorator extends Decorator {
    public SweetDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "with 糖";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.5;
    }
}
