package org.advanced.streams;

public class StreamsMainBasic {

	/*Stream Creation 
	1. Stream.of
	2. .Stream
	3. StreamBuilder     */
	public static void main(String[] args) {
		StreamSimpleImpl streamSimpleImpl = new StreamSimpleImpl();
		
		Sedans[] sedanList = {new Sedans(1,"VW",2000,"Jetta"),new Sedans(2,"Skoda",2000,"Octavia")
				,new Sedans(3,"Skoda",1600,"Rapid")};
		streamSimpleImpl.streamFilter(sedanList);
		System.out.println("Filter and Update");
		streamSimpleImpl.streamFilterAndUpdate(sedanList, 1495);
		System.out.println("After Filter and Update");
		streamSimpleImpl.streamFilter(sedanList);
		System.out.println("-- Input Array --");
		for(Sedans s1:sedanList) {
			System.out.println(s1);
		}
		System.out.println("-- streamwithMap --");
		Integer[] idInp = {1,2,3};
		streamSimpleImpl.streamwithMap(idInp);
	}
}


/*
Sedans [id=1, brand=VW, cubicCapacity=2000, model=Jetta]
Sedans [id=2, brand=Skoda, cubicCapacity=2000, model=Octavia]
Filter and Update
Sedans [id=1, brand=VW, cubicCapacity=1495, model=Jetta]
Sedans [id=2, brand=Skoda, cubicCapacity=1495, model=Octavia]
After Filter and Update
Sedans [id=1, brand=VW, cubicCapacity=1495, model=Jetta]
Sedans [id=2, brand=Skoda, cubicCapacity=1495, model=Octavia]
-- Input Array --
Sedans [id=1, brand=VW, cubicCapacity=1495, model=Jetta]
Sedans [id=2, brand=Skoda, cubicCapacity=1495, model=Octavia]
Sedans [id=3, brand=Skoda, cubicCapacity=1600, model=Rapid]
-- streamwithMap --
Sedans [id=1, brand=VW, cubicCapacity=2000, model=Jetta]
Sedans [id=2, brand=Audi, cubicCapacity=2000, model=A3]
Sedans [id=3, brand=Audi, cubicCapacity=3500, model=A6]
*/