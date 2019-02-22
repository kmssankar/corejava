package org.concepts.immutable;

import java.util.ArrayList;

/*To create immutable class in java, you have to do following steps.

Declare the class as final so it can’t be extended.
Make all fields private so that direct access is not allowed.
Don’t provide setter methods for variables
Make all mutable fields final so that it’s value can be assigned only once.
Initialize all the fields via a constructor performing deep copy.
Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.*/

public class ImmutableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> consInp = new ArrayList<>();
		consInp.add("Sankar");
		consInp.add("Arun");
		consInp.add("Dhanajayan");
		
		ImmutableClass immutableClass = new ImmutableClass(12,"Friends",consInp);
		
		ArrayList<String> Mylist = immutableClass.getlist();
		for(String str: Mylist)
			{
				System.out.println(str);
			}
		Mylist.add("Sriram");
		
		for(String str: immutableClass.getlist())
			{
				System.out.println(str);
			}
		

	}

}
