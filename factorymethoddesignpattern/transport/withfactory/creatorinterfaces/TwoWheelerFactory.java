package factorymethoddesignpattern.transport.withfactory.creatorinterfaces;


import factorymethoddesignpattern.transport.withfactory.Vehicle;
import factorymethoddesignpattern.transport.withfactory.VehicleFactory;
import factorymethoddesignpattern.transport.withfactory.concreteproducts.TwoWheeler;

// Concrete Factory for TwoWheeler
public class TwoWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
