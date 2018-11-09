package state;

public class WaitPayState implements OrderState {
    private final Order order;

    public WaitPayState(Order order) {
        this.order = order;
    }

    @Override
    public void confirm() {
        if (isNull(order)) return;
        System.out.println("订单已接收");
    }

    @Override
    public void cancel() {
        if (isNull(order)) return;
        System.out.println("取消支付，进入待确认");
        this.order.setCurrentState(order.getWaitConfirmState());
    }

    @Override
    public void pay() {
        if (isNull(order)) return;
        System.out.println("支付成功");
        this.order.setCurrentState(order.getHadPayState());
    }
}
