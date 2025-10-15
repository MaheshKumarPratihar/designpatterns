package factorymethoddesignpattern.restaurant.receipt.concreteproducts;

import factorymethoddesignpattern.restaurant.receipt.Receipt;

// Concrete Product 2 - Takeaway Receipt
public class TakeawayReceipt implements Receipt {
    private String orderId;
    private String readyTime;
    private int pickupCounter;
    private double totalAmount;

    public TakeawayReceipt(String orderId, String readyTime, int pickupCounter, double totalAmount) {
        this.orderId = orderId;
        this.readyTime = readyTime;
        this.pickupCounter = pickupCounter;
        this.totalAmount = totalAmount;
    }

    @Override
    public void generate() {
        System.out.println("Generating takeaway receipt...");
    }

    @Override
    public void print() {
        System.out.println("\n========== TAKEAWAY RECEIPT ==========");
        System.out.println(getReceiptDetails());
        System.out.println("======================================\n");
    }

    @Override
    public String getReceiptDetails() {
        return String.format(
                "Order ID: %s\nReady By: %s\nPickup Counter: %d\nTotal Amount: $%.2f\nPlease collect from counter!",
                orderId, readyTime, pickupCounter, totalAmount
        );
    }
}
