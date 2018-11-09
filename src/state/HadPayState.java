package state;

public class HadPayState implements OrderState {
    private final Order order;

    public HadPayState(Order order) {
        this.order = order;
    }

    @Override
    public void confirm() {
        if (isNull(order)) return;
        System.out.println("已支付,无需确认");
    }

    @Override
    public void cancel() {
        if (isNull(order)) return;
        System.out.println("已支付，不能取消");
    }

    @Override
    public void pay() {
        if (isNull(order)) return;
        System.out.println("已经支付了，不要重复支付");
    }
}
