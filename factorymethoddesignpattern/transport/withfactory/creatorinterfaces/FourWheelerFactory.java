package factorymethoddesignpattern.transport.withfactory.creatorinterfaces;


import factorymethoddesignpattern.transport.withfactory.Vehicle;
import factorymethoddesignpattern.transport.withfactory.VehicleFactory;
import factorymethoddesignpattern.transport.withfactory.concreteproducts.FourWheeler;

// Concrete Factory for FourWheeler
public class FourWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
