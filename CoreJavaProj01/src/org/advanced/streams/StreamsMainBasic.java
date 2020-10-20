package org.advanced.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsMainBasic {

	/*
	 * Stream Creation 1. Stream.of 2. .Stream 3. StreamBuilder
	 */
	public static void main(String[] args) {
		StreamSimpleImpl streamSimpleImpl = new StreamSimpleImpl();

		Sedans[] sedanList = { new Sedans(1, "VW", 2000, "Jetta"), new Sedans(2, "Skoda", 2000, "Octavia"),
				new Sedans(3, "Skoda", 1600, "Rapid"), new Sedans(4, "Skoda", 1000, "Fabia"), new Sedans(6, "BMW", 1998, "320D"),
				new Sedans(5, "Volkswagen", 1600, "Passat") };
		streamSimpleImpl.streamFilter(sedanList);
		System.out.println("Filter and Update");
		streamSimpleImpl.streamFilterAndUpdate(sedanList, 1495);
		System.out.println("After Filter and Update");
		streamSimpleImpl.streamFilter(sedanList);
		System.out.println("-- Input Array --");
		for (Sedans s1 : sedanList)
			{
				System.out.println(s1);
			}
		System.out.println("-- streamwithMap --");
		Integer[] idInp = { 1, 2, 3 };
		streamSimpleImpl.streamwithMap(idInp);
		
		System.out.println("-- Collect to Set --");
		streamSimpleImpl.collectToSet(sedanList);
		
		System.out.println("-- Collect to Map --");
		streamSimpleImpl.collectToListByMap(sedanList);
		
		System.out.println("-- Count on Filter  --");
		streamSimpleImpl.countOnFilter(sedanList);
		
		System.out.println("-- collect to Set [Map using a method ] --");
		streamSimpleImpl.showAllBrands(sedanList);
		
		System.out.println("-- collect to Map ---");
		streamSimpleImpl.collectToMap(sedanList);
		
		System.out.println("-- Sort using comparator Lambda Expression ---");
		streamSimpleImpl.sortByBrand(sedanList);
		
		System.out.println("-- Show Summary ---");
		streamSimpleImpl.showSummary(sedanList);
		
		System.out.println("-- get Max by field  ---");
		Sedans se =Arrays.asList(sedanList).stream().max((e1,e2)->e1.getCubicCapacity()-e2.getCubicCapacity()).get();
		System.out.println("\n Max CC \n"+se);
		
		System.out.println("--Grouping by  field  ---");
		Map<String,List<Sedans>> BrandMap = Arrays.asList(sedanList).stream().collect(Collectors.groupingBy(Sedans::getBrand));
		BrandMap.entrySet().stream().forEach(System.out::print);
		
		Map<String,Long> cntBybrand = Arrays.asList(sedanList).stream().collect(Collectors.groupingBy(Sedans::getBrand,Collectors.counting()));
		System.out.println("\n  --- Count by brand -- ");
		cntBybrand.entrySet().stream().forEach(System.out::print);
		
	}
}

/*
Sedans [id=1, brand=VW, cubicCapacity=2000, model=Jetta]
Sedans [id=2, brand=Skoda, cubicCapacity=2000, model=Octavia]
Filter and Update
Sedans [id=1, brand=VW, cubicCapacity=1495, model=Jetta]
After Filter and Update
Sedans [id=1, brand=VW, cubicCapacity=1495, model=Jetta]
Sedans [id=2, brand=Skoda, cubicCapacity=2000, model=Octavia]
-- Input Array --
Sedans [id=1, brand=VW, cubicCapacity=1495, model=Jetta]
Sedans [id=2, brand=Skoda, cubicCapacity=2000, model=Octavia]
Sedans [id=3, brand=Skoda, cubicCapacity=1600, model=Rapid]
Sedans [id=4, brand=Skoda, cubicCapacity=1000, model=Fabia]
Sedans [id=6, brand=BMW, cubicCapacity=1998, model=320D]
Sedans [id=5, brand=Volkswagen, cubicCapacity=1600, model=Passat]
-- streamwithMap --
Sedans [id=1, brand=VW, cubicCapacity=2000, model=Jetta]
Sedans [id=2, brand=Audi, cubicCapacity=2000, model=A3]
Sedans [id=3, brand=Audi, cubicCapacity=3500, model=A6]
-- Collect to Set --
Sedans [id=1, brand=VW, cubicCapacity=1495, model=Jetta]
-- Collect to Map --
Sedans [id=1, brand=VW, cubicCapacity=1495, model=Jetta]
-- Count on Filter  --
 Count based on Filter : 5
-- collect to Set [Map using a method ] --
VW
Volkswagen
Skoda
BMW
-- collect to Map ---
 Key -> 1 Value -> Jetta
 Key -> 2 Value -> Octavia
 Key -> 3 Value -> Rapid
 Key -> 4 Value -> Fabia
 Key -> 5 Value -> Passat
 Key -> 6 Value -> 320D
-- Sort using comparator Lambda Expression ---
Sedans [id=6, brand=BMW, cubicCapacity=1998, model=320D]
Sedans [id=2, brand=Skoda, cubicCapacity=2000, model=Octavia]
Sedans [id=3, brand=Skoda, cubicCapacity=1600, model=Rapid]
Sedans [id=4, brand=Skoda, cubicCapacity=1000, model=Fabia]
Sedans [id=1, brand=VW, cubicCapacity=1495, model=Jetta]
Sedans [id=5, brand=Volkswagen, cubicCapacity=1600, model=Passat]
-- Show Summary ---
Count -> 6 Maximum -> 6
-- get Max by field  ---

 Max CC 
Sedans [id=2, brand=Skoda, cubicCapacity=2000, model=Octavia]
--Grouping by  field  ---
VW=[Sedans [id=1, brand=VW, cubicCapacity=1495, model=Jetta]]Volkswagen=[Sedans [id=5, brand=Volkswagen, cubicCapacity=1600, model=Passat]]Skoda=[Sedans [id=2, brand=Skoda, cubicCapacity=2000, model=Octavia], Sedans [id=3, brand=Skoda, cubicCapacity=1600, model=Rapid], Sedans [id=4, brand=Skoda, cubicCapacity=1000, model=Fabia]]BMW=[Sedans [id=6, brand=BMW, cubicCapacity=1998, model=320D]]
  --- Count by brand -- 
VW=1Volkswagen=1Skoda=3BMW=1
 */