package org.corejava.oops;

/*Dynamic method dispatch is a mechanism by which a call to an overridden method is resolved at runtime. 
This is how java implements runtime polymorphism. When an overridden method is called by a reference, 
java determines which version of that method to execute based on the type of object it refer to.*/
public class DynamicMethodDispatchMain {

	public static void main(String[] args) {
		Vehicle Veh = new Vehicle();
		Car CarInst = new Car();
		//Veh = CarInst;
		// The method in Car will be called even method in vehicle type is called
		Veh.showdet();
		Vehicle Veh2 = new Car();
		Veh2.showdet();
	}
}

/*
OUTPUT
 This is vehicle !! 
 This is Car !! 2019*/