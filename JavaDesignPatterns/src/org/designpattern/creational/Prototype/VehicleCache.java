package org.designpattern.creational.Prototype;

import java.util.HashMap;

public class VehicleCache {

	static HashMap<String ,Vehicle> VehicleCache = new HashMap<String ,Vehicle>();
	
	public static void AddCache()
	{
		Car car = new Car();
		car.setType("car");
		VehicleCache.put(car.getType(), car);
		
		Truck truck = new Truck();
		truck.setType("truck");
		VehicleCache.put(truck.getType(), truck);
		
		Tractor tractor = new Tractor();
		tractor.setType("tractor");
		VehicleCache.put(tractor.getType(), tractor);
	}
	
	public static Vehicle getvehicle(String Vehicle)
	{
		Vehicle vehicle = VehicleCache.get(Vehicle);
		return vehicle;
	}
	
	
}
