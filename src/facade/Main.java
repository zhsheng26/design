package facade;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Key key = new Key();
        key.setAuthorized(true);
        car.start(key);
    }
}
