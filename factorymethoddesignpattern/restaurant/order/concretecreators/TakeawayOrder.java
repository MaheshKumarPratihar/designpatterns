package factorymethoddesignpattern.restaurant.order.concretecreators;


import factorymethoddesignpattern.restaurant.order.ordercreator.Order;
import factorymethoddesignpattern.restaurant.receipt.Receipt;
import factorymethoddesignpattern.restaurant.receipt.concreteproducts.TakeawayReceipt;

// Concrete Creator 2 - Takeaway Order
public class TakeawayOrder extends Order {
    private final String readyTime;
    private final int pickupCounter;

    public TakeawayOrder(String orderId, double totalAmount, String[] items,
                         String readyTime, int pickupCounter) {
        super(orderId, totalAmount, items);
        this.readyTime = readyTime;
        this.pickupCounter = pickupCounter;
    }

    @Override
    protected Receipt createReceipt() {
        return new TakeawayReceipt(orderId, readyTime, pickupCounter, totalAmount);
    }
}
