package factorymethoddesignpattern.restaurant.order.concretecreators;


import factorymethoddesignpattern.restaurant.order.ordercreator.Order;
import factorymethoddesignpattern.restaurant.receipt.concreteproducts.DineInReceipt;
import factorymethoddesignpattern.restaurant.receipt.Receipt;

// Concrete Creator 1 - Dine-in Order
public class DineInOrder extends Order {
    private final int tableNumber;
    private final String waiterName;

    public DineInOrder(String orderId, double totalAmount, String[] items,
                       int tableNumber, String waiterName) {
        super(orderId, totalAmount, items);
        this.tableNumber = tableNumber;
        this.waiterName = waiterName;
    }

    @Override
    protected Receipt createReceipt() {
        // Factory method creates specific receipt type
        return new DineInReceipt(orderId, tableNumber, waiterName, totalAmount);
    }
}
