package org.advanced.generics;

import java.util.ArrayList;
import java.util.List;

/*GENERICS - added to the Java language from Java 5
Generics add a way to specify concrete types to general purpose classes and methods 
that operated on Object before*/
public class TypeInferenceMain {

	public static void main(String[] args) {

		//Normal declaration without type inference
		List<String> ListStr = new ArrayList<String>();
		ListStr.add("Test Str 1");
		ListStr.add("Test Str 2");
		ListStr.add("Test Str 3");
		
		for(String listStr: ListStr)
			{
				System.out.println(listStr);
			}
		
		//Declaration with type inference
		/*From Java 7 the Java compiler can infer the
		type of the collection instantiated from the variable the collection is assigned to*/
		System.out.println("Declaration with type inference");
		List<String> ListStrTypInfr = new ArrayList<>();
		ListStrTypInfr.add("Test Type Infer Str 1");
		ListStrTypInfr.add("Test Type Infer Str 2");
		ListStrTypInfr.add("Test Type Infer Str 3");
		
		for(String listStr: ListStrTypInfr)
			{
				System.out.println(listStr);
			}
	}

}

/*OUTPUT
Test Str 1
Test Str 2
Test Str 3
Declaration with type inference
Test Type Infer Str 1
Test Type Infer Str 2
Test Type Infer Str 3*/