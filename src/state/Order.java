package state;

public class Order {
    //待确认
    //待支付
    //已支付

    private WaitConfirmState waitConfirmState;
    private WaitPayState waitPayState;
    private HadPayState hadPayState;
    private OrderState currentState;

    public Order() {
        this.waitConfirmState = new WaitConfirmState(this);
        this.waitPayState = new WaitPayState(this);
        this.hadPayState = new HadPayState(this);
        this.currentState = waitConfirmState;
    }

    public WaitConfirmState getWaitConfirmState() {
        return waitConfirmState;
    }

    public WaitPayState getWaitPayState() {
        return waitPayState;
    }

    public HadPayState getHadPayState() {
        return hadPayState;
    }

    public void setCurrentState(OrderState currentState) {
        this.currentState = currentState;
    }

    public void confirm() {
        this.currentState.confirm();
    }

    public void cancel() {
        this.currentState.cancel();
    }

    public void pay() {
        this.currentState.pay();
    }
}
