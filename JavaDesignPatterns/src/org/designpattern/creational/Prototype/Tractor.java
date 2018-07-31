package org.designpattern.creational.Prototype;

public class Tractor extends Vehicle{

	Tractor()
	{
		Manufactuer = "VOLVO";
	}
	@Override
	void showDetails() {
		System.out.println("This is Tractor Manufacturer : " + Manufactuer);
		
	}

}
