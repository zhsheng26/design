package facade;

public class Car {

    private Engine engine;
    private Door door;

    public Car() {
        engine = new Engine();
        door = new Door();
    }

    public void start(Key key) {
        if (key.isAuthorized()) {
            door.open();
            engine.start();
            updateDashboardDisplay();
            door.lock();
        }
    }

    private void updateDashboardDisplay() {
        System.out.println("时速100km/h");
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }
}
