package factorymethoddesignpattern.transport.nonfactory;


// Client (or user) class
public class Client {
    private Vehicle vehicle;

    public Client(int type) {
        if (type == 1) {
            vehicle = new TwoWheeler();
        } else if (type == 2) {
            vehicle = new FourWheeler();
        } else {
            vehicle = null;
        }
    }

    public void cleanup() {
        if (vehicle != null) {
            vehicle = null;
        }
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
