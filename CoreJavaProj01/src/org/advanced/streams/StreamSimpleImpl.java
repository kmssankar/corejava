package org.advanced.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamSimpleImpl {

	public void streamFilter(Sedans[] sedanAry) {
		List<Sedans> sedanList = Arrays.asList(sedanAry);
		// Getting Stream from existing list
		List<Sedans> sedanlt3 = sedanList.stream().filter(e -> (e.id < 3)).collect(Collectors.toList());
		for (Sedans s1 : sedanlt3)
			{
				System.out.println(s1);
			}
	}

	public void streamFilterAndUpdate(Sedans[] sedanAry, int cubicCapacity) {
		List<Sedans> sedanList = Arrays.asList(sedanAry);
		// Getting Stream from existing list
		List<Sedans> sedanlt3 = sedanList.stream().filter(e -> (e.id < 2)).peek(e -> e.setCubicCapacity(cubicCapacity))
				.collect(Collectors.toList());
		for (Sedans s1 : sedanlt3)
			{
				System.out.println(s1);
			}
	}

	public void streamwithMap(Integer[] idInp) {
		SedanRepo sedanRepo = new SedanRepo();
		List<Sedans> sedanList = Arrays.asList(idInp).stream().map(sedanRepo::getSedan).collect(Collectors.toList());
		sedanList.stream().forEach(System.out::println);
	}

	public void collectToSet(Sedans[] sedanAry) {
		Set<Sedans> sedanSet = Arrays.asList(sedanAry).stream().map(n -> {
			if (n.getBrand().equalsIgnoreCase("VW"))
				return n;
			else
				return null;
		}).filter(n->n!=null).collect(Collectors.toSet());
		sedanSet.stream().forEach(System.out::println);
	}

	public void countOnFilter(Sedans[] sedanAry) {
		long count = Arrays.asList(sedanAry).stream().filter(n -> n.cubicCapacity < 1999).count();
		System.out.println(" Count based on Filter : " + count);
	}

	public void collectToListByMap(Sedans[] sedanAry) {
		List<Sedans> sedanList = Arrays.asList(sedanAry).stream().map(n -> {
			if (n.getBrand().equalsIgnoreCase("VW"))
				return n;
			else
				return null;
		}).filter(n -> n != null).collect(Collectors.toList());
		sedanList.stream().forEach(System.out::println);
	}
	
	public void showAllBrands(Sedans[] sedanAry) {
		Set<String> allBrands = Arrays.asList(sedanAry).stream().map(n -> n.getBrand()).collect(Collectors.toSet());
		allBrands.stream().forEach(System.out::println);
	}
	
	public void collectToMap(Sedans[] sedanAry) {
		Map<Integer,String> brandMap = Arrays.asList(sedanAry).stream().collect(Collectors.toMap(s->s.getId(), s->s.getModel()));
		for(Entry<Integer,String> es:brandMap.entrySet()) {
			System.out.println(" Key -> " + es.getKey() + " Value -> " + es.getValue());
		}
	}
	
	public void sortByBrand(Sedans[] sedanAry) {
		List<Sedans> sedanSorted = Arrays.asList(sedanAry).stream().sorted(Comparator.comparing(Sedans::getBrand)).collect(Collectors.toList());
		sedanSorted.forEach(System.out::println);
	}
	
	public void showSummary(Sedans[] sedanAry) {
	 
		IntSummaryStatistics summay = Arrays.asList(sedanAry).stream().mapToInt(n->n.getId()).summaryStatistics();
		System.out.println("Count -> " + summay.getCount() + " Maximum -> " + summay.getMax() + " Avg -> " + summay.getAverage());
		 
	}
	
}
