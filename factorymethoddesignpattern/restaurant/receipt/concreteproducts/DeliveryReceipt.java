package factorymethoddesignpattern.restaurant.receipt.concreteproducts;


import factorymethoddesignpattern.restaurant.receipt.Receipt;

// Concrete Product 3 - Delivery Receipt
public class DeliveryReceipt implements Receipt {
    private final String orderId;
    private final String deliveryAddress;
    private final String estimatedDeliveryTime;
    private final double deliveryFee;
    private final double totalAmount;

    public DeliveryReceipt(String orderId, String deliveryAddress, String estimatedDeliveryTime,
                           double deliveryFee, double totalAmount) {
        this.orderId = orderId;
        this.deliveryAddress = deliveryAddress;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.deliveryFee = deliveryFee;
        this.totalAmount = totalAmount;
    }

    @Override
    public void generate() {
        System.out.println("Generating delivery receipt...");
    }

    @Override
    public void print() {
        System.out.println("\n========== DELIVERY RECEIPT ==========");
        System.out.println(getReceiptDetails());
        System.out.println("======================================\n");
    }

    @Override
    public String getReceiptDetails() {
        return String.format(
                "Order ID: %s\nDelivery Address: %s\nEstimated Delivery: %s\nDelivery Fee: $%.2f\nTotal Amount: $%.2f\nTrack your order online!",
                orderId, deliveryAddress, estimatedDeliveryTime, deliveryFee, totalAmount
        );
    }
}
