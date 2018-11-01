package factory;

public class ChinaPizzaStore extends PizzaStore {
    private final PizzaFactory pizzaFactory;

    public ChinaPizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    @Override
    Pizza makePizza(String type) {
        return pizzaFactory.make(type);
    }
}
