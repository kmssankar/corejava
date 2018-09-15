package org.corejava.clone;

public class CloneTestMain {

	public static void main(String[] args) {
		
		CloneChild Chl1 = new CloneChild(12, "Toyota", "Automotive");
		CloneChild Chl2 = (CloneChild) Chl1.clone();
		Chl1.setDescr("Industrial");
		System.out.println("Chl1   :" + Chl1);
		System.out.println("Chl2   :" + Chl2);
	}
}

/*OUTPUT
Clone Base Called !!
Clone Child Called !!
Chl1   :CloneChild [descr=Industrial, id=12, Name=Toyota]
Chl2   :CloneChild [descr=Automotive, id=12, Name=Toyota]*/