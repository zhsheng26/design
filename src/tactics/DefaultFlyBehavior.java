package tactics;

public class DefaultFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("普通鸭子的飞行");
    }
}
