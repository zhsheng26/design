package state;

public class Main {
    public static void main(String[] args) {
        System.out.println("--确认--支付--");
        Order order = new Order();
        order.confirm();
        order.cancel();
        order.confirm();
        order.pay();
        order.pay();
    }
}
