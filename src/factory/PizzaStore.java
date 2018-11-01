package factory;

public abstract class PizzaStore {
    public void orderPizza(String type) {
        Pizza pizza = makePizza(type);
        pizza.hot();
        pizza.cut();
        pizza.serve();
    }

    //工厂方法
    abstract Pizza makePizza(String type);
}
