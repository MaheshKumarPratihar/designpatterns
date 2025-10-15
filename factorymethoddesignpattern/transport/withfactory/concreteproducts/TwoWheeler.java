package factorymethoddesignpattern.transport.withfactory.concreteproducts;

import factorymethoddesignpattern.transport.withfactory.Vehicle;

public class TwoWheeler implements Vehicle {
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}
