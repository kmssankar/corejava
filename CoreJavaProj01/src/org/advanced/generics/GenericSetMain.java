package org.advanced.generics;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericSetMain {

	public static void main(String[] args) {
		
		Set<String> SetTypInfr = new HashSet<>();
		SetTypInfr.add("String 1");
		SetTypInfr.add("String 2");
		SetTypInfr.add("String 3");
		System.out.println("Using For Each");
		for(String StrinSet:SetTypInfr)
			{
				System.out.println(StrinSet);
			}
		
		Iterator<?> SetItr = SetTypInfr.iterator();
		System.out.println("Using Iterator");
		while(SetItr.hasNext())
			{
				System.out.println(SetItr.next());
			}		
	}
}

/*OUTPUT
Using For Each
String 1
String 2
String 3
Using Iterator
String 1
String 2
String 3
*/