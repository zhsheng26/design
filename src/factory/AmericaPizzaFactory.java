package factory;

public class AmericaPizzaFactory implements PizzaFactory {
    @Override
    public Pizza make(String type) {
        return new AmericaPizza();
    }
}
