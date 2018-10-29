package decorator;

/**
 * 调味料
 */
public abstract class Decorator extends Beverage {
    protected final Beverage beverage;

    public Decorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();
}
