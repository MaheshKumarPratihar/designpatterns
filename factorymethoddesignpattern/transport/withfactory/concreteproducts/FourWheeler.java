package factorymethoddesignpattern.transport.withfactory.concreteproducts;

import factorymethoddesignpattern.transport.withfactory.Vehicle;

public class FourWheeler implements Vehicle {
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}
