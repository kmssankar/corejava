package org.advanced.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericListMain {

	public static void main(String[] args) {
		
		//Java collections can be used to store object reference 
		List mylist = new ArrayList();
		
		mylist.add("String");
		mylist.add(new Integer(12));
		
		/*int Int1 = (int) mylist.get(0);
		 * The Above cast code will cause class cast exception during runtime
		Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
		at org.advanced.generics.GenericListMain.main(GenericListMain.java:17)
		String Str1 = (String) mylist.get(0);*/
		System.out.println(mylist.get(0));
		System.out.println(mylist.get(1));
		
		List<String> ListStrTypInfr = new ArrayList<>();
		ListStrTypInfr.add("Test Type Infer Str 1");
		ListStrTypInfr.add("Test Type Infer Str 2");
		ListStrTypInfr.add("Test Type Infer Str 3");
		
		System.out.println("Using Type Inference");
		Iterator<?> itr = ListStrTypInfr.iterator();
		
		while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		System.out.println("Using Generic Iterator");
		Iterator<String> itr2 = ListStrTypInfr.iterator();
		
		while(itr2.hasNext())
			{
				System.out.println(itr2.next());
			}
		

	}

}

/*OUTPUT
String
12
Using Type Inference
Test Type Infer Str 1
Test Type Infer Str 2
Test Type Infer Str 3
Using Generic Iterator
Test Type Infer Str 1
Test Type Infer Str 2
Test Type Infer Str 3*/
