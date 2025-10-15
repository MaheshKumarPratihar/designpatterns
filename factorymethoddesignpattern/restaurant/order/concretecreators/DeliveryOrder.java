package factorymethoddesignpattern.restaurant.order.concretecreators;


import factorymethoddesignpattern.restaurant.order.ordercreator.Order;
import factorymethoddesignpattern.restaurant.receipt.concreteproducts.DeliveryReceipt;
import factorymethoddesignpattern.restaurant.receipt.Receipt;

// Concrete Creator 3 - Delivery Order
public class DeliveryOrder extends Order {
    private final String deliveryAddress;
    private final String estimatedDeliveryTime;
    private final double deliveryFee;

    public DeliveryOrder(String orderId, double totalAmount, String[] items,
                         String deliveryAddress, String estimatedDeliveryTime, double deliveryFee) {
        super(orderId, totalAmount, items);
        this.deliveryAddress = deliveryAddress;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.deliveryFee = deliveryFee;
    }

    @Override
    protected Receipt createReceipt() {
        return new DeliveryReceipt(orderId, deliveryAddress, estimatedDeliveryTime,
                deliveryFee, totalAmount);
    }
}
