package org.designpattern.creational.Prototype;

public class Car extends Vehicle{

	Car()
	{
		Manufactuer = "VOLKSWAGEN";
	}
	@Override
	void showDetails() {
		System.out.println("This is Car Manufacturer : " + Manufactuer);
		
	}
	
	

}
