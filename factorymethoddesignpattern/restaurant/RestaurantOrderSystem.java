package factorymethoddesignpattern.restaurant;

import factorymethoddesignpattern.restaurant.order.concretecreators.DeliveryOrder;
import factorymethoddesignpattern.restaurant.order.concretecreators.DineInOrder;
import factorymethoddesignpattern.restaurant.order.ordercreator.Order;
import factorymethoddesignpattern.restaurant.order.concretecreators.TakeawayOrder;

// Client Code
public class RestaurantOrderSystem {
    public static void main(String[] args) {
        System.out.println("=== TastyBites Restaurant Order Management System ===\n");

        // Create different types of orders
        String[] items1 = {"Burger", "Fries", "Coke"};
        Order dineInOrder = new DineInOrder("DI-001", 25.50, items1, 12, "John");

        String[] items2 = {"Pizza", "Salad"};
        Order takeawayOrder = new TakeawayOrder("TA-002", 32.00, items2, "6:30 PM", 3);

        String[] items3 = {"Pasta", "Garlic Bread", "Wine"};
        Order deliveryOrder = new DeliveryOrder("DL-003", 45.75, items3,
                "123 Main St, Apt 4B", "7:15 PM", 5.00);

        // Process orders - each creates appropriate receipt through factory method
        dineInOrder.processOrder();
        takeawayOrder.processOrder();
        deliveryOrder.processOrder();

        // Demonstrate polymorphism - working with Order array
        System.out.println("\n=== Processing Multiple Orders ===");
        Order[] orders = {dineInOrder, takeawayOrder, deliveryOrder};

        for (Order order : orders) {
            System.out.println("\nProcessing order ID: " + order.getOrderId());
            order.processOrder();
        }
    }
}