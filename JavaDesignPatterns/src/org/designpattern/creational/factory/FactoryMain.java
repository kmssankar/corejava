package org.designpattern.creational.factory;

public class FactoryMain {

	public static void main(String[] args) {
		
		System.out.println("Args : " + args[0]);
		VehicleFactory FACMAIN = new VehicleFactory();
		
		Vehicle Car = FACMAIN.getVehicle("Car");
		Car.showDetais();
		
		Vehicle Truck = FACMAIN.getVehicle("Truck");
		Truck.showDetais();
	}

}
