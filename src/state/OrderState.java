package state;

public interface OrderState {
    /**
     * 确认
     */
    void confirm();

    /**
     * 取消
     */
    void cancel();

    /**
     * 支付
     */
    void pay();

    default boolean isNull(Order order) {
        if (order == null) {
            System.out.println("订单不存在");
            return true;
        }
        return false;
    }
}
