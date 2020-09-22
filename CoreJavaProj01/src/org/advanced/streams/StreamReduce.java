package org.advanced.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class StreamReduce {

	public static void main(String[] args) {
		Integer[] myArr = {11,3,5,1,2,3};		
		int countOut = Arrays.asList(myArr).stream().reduce(0,(count ,num)-> count =count+num);
		System.out.println("Count out : " + countOut);
		int smallout = Arrays.asList(myArr).stream().reduce(Integer.MAX_VALUE,(count ,num)-> count =(count>num)? num:count);
		System.out.println("small out : " + smallout);
	}

	private static Map<Integer,String> reverseMap(Map <Integer,String> inMap){
		
		Map<Integer,String> reverseMap = new LinkedHashMap<>();
		
		return reverseMap;
	}
}
