package factorymethoddesignpattern.restaurant.receipt;

// Product Interface - defines what all receipts must do
public interface Receipt {
    void generate();

    void print();

    String getReceiptDetails();
}
