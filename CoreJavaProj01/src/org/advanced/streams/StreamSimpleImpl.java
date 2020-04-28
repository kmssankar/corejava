package org.advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSimpleImpl {
	
	public void streamFilter(Sedans[] sedanAry) {
		List<Sedans> sedanList = Arrays.asList(sedanAry);
		//Getting Stream from existing list
		List<Sedans> sedanlt3 = sedanList.stream().filter(e->(e.id < 3)).collect(Collectors.toList());
		for(Sedans s1 : sedanlt3) {
			System.out.println(s1);
		}
	}
	
	public void streamFilterAndUpdate(Sedans[] sedanAry,int cubicCapacity) {
		List<Sedans> sedanList = Arrays.asList(sedanAry);
		//Getting Stream from existing list
		List<Sedans> sedanlt3 = sedanList.stream().filter(e->(e.id < 3)).peek(e->e.setCubicCapacity(cubicCapacity))
				.collect(Collectors.toList());
		for(Sedans s1 : sedanlt3) {
			System.out.println(s1);
		}
	}
	
	public void streamwithMap(Integer[] idInp) {
		SedanRepo sedanRepo = new SedanRepo();
		List<Sedans> sedanList = Arrays.asList(idInp).stream().map(sedanRepo::getSedan).collect(Collectors.toList());
		sedanList.stream().forEach(System.out::println);
	}
}
