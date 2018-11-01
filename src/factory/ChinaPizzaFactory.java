package factory;

public class ChinaPizzaFactory implements PizzaFactory {
    @Override
    public Pizza make(String type) {
        return new ChinaPizza();
    }
}
