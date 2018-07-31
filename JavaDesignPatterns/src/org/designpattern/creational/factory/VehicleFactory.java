package org.designpattern.creational.factory;

public class VehicleFactory {

	public Vehicle getVehicle(String Veh)
	{
		Vehicle VehReturn =null;
		switch (Veh)
		{
			case "Car":
				VehReturn = new Car();
				break;
			case "Truck":
				VehReturn = new Truck();
				break;
		}
		return VehReturn;
	}
}
