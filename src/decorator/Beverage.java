package decorator;

/**
 * 饮料
 */
public abstract class Beverage {

    protected String description = "Unknown type";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
