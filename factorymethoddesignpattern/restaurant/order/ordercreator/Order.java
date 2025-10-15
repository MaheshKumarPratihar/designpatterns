package factorymethoddesignpattern.restaurant.order.ordercreator;


import factorymethoddesignpattern.restaurant.receipt.Receipt;

// Creator (Abstract Class) - defines the factory method
public abstract class Order {
    protected String orderId;
    protected double totalAmount;
    protected String[] items;

    public Order(String orderId, double totalAmount, String[] items) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.items = items;
    }

    // Factory Method - subclasses will override this
    protected abstract Receipt createReceipt();

    // Template method that uses the factory method
    public void processOrder() {
        System.out.println("Processing order: " + orderId);
        System.out.println("Items: " + String.join(", ", items));

        // Create receipt using factory method
        Receipt receipt = createReceipt();
        receipt.generate();
        receipt.print();
    }

    public String getOrderId() {
        return orderId;
    }
}
