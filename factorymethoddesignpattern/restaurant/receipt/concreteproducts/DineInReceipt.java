package factorymethoddesignpattern.restaurant.receipt.concreteproducts;


import factorymethoddesignpattern.restaurant.receipt.Receipt;

// Concrete Product 1 - Dine-in Receipt
public class DineInReceipt implements Receipt {
    private final String orderId;
    private final int tableNumber;
    private final String waiterName;
    private final double totalAmount;

    public DineInReceipt(String orderId, int tableNumber, String waiterName, double totalAmount) {
        this.orderId = orderId;
        this.tableNumber = tableNumber;
        this.waiterName = waiterName;
        this.totalAmount = totalAmount;
    }

    @Override
    public void generate() {
        System.out.println("Generating dine-in receipt...");
    }

    @Override
    public void print() {
        System.out.println("\n========== DINE-IN RECEIPT ==========");
        System.out.println(getReceiptDetails());
        System.out.println("====================================\n");
    }

    @Override
    public String getReceiptDetails() {
        return String.format("Order ID: %s\nTable Number: %d\nWaiter: %s\nTotal Amount: $%.2f\nThank you for dining with us!", orderId, tableNumber, waiterName, totalAmount);
    }
}
