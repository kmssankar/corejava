package org.designpattern.creational.Prototype;

public class Truck extends Vehicle{

	Truck()
	{
		Manufactuer ="TOYOTA";
	}
	@Override
	void showDetails() {
		System.out.println("This is Truck Manufacturer : " + Manufactuer);
	}

}
