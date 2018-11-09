package state;

public class WaitConfirmState implements OrderState {
    private Order order;

    public WaitConfirmState(Order order) {
        this.order = order;
    }


    @Override
    public void confirm() {
        if (isNull(order)) return;
        System.out.println("确认接收订单");
        order.setCurrentState(order.getWaitPayState());
    }

    @Override
    public void cancel() {
        if (isNull(order)) return;
        System.out.println("取消订单，订单将不存在了");
        this.order = null;
    }

    @Override
    public void pay() {
        if (isNull(order)) return;
        System.out.println("订单未确认接收");
    }
}
