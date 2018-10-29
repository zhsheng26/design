package decorator;

/**
 * 普通咖啡
 */
public class NormalCoffee extends Beverage {

    public NormalCoffee() {
        this.description = "咖啡";
    }

    @Override
    public double cost() {
        return 1.8;
    }
}
