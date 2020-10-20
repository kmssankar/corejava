package org.corejava.probsolv.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.w3c.dom.NodeList;

public class RemoveCycles {

	public static void main(String[] args) {

		int arr[][] = { {4,1}, { 2, 3 }, { 3, 4 } ,{ 1, 2 }  };
		int size = 4;
		int sz =2 ;
//		List<String> slist = new ArrayList<>();
//		Map<String,Integer> cntmap = new HashMap<>();
//		String s1 = "ababa";
//		for(int i=0;i<s1.length()-sz+1;i++)
//		{	
//			
//			String sout = s1.substring(i,i+sz);
//			slist.add(sout);
//			if(cntmap.containsKey(sout)) {
//				int newCnt = cntmap.get(sout)+1;
//				cntmap.put(sout, newCnt);
//			}else {
//				cntmap.put(sout, 1);
//			}
//			int end = i+sz;
//		System.out.println(" i , i=z " + i +" : " + end + " >> " + sout);
//		}
//		System.out.println(slist.size());
//		cntmap.entrySet().stream().forEach(n -> System.out.println(n.getKey() +" cnt : "+n.getValue()));
//		
//		
		
		 int[] outArr = remCycles(size,arr); System.out.println(" \n output -- ");
		 for(Integer i : outArr) { System.out.print(i + " "); 
		 }
		
		//Arrays.asList(outArr).stream().forEach(System.out::print);

	}

	public static int[] remCycles(int noOfNodes, int[][] arrIn) {
		Map<Integer, Integer> nodes = new HashMap<>();
		List<Integer> listIn = new ArrayList<>();
		for (int i = 0; i < noOfNodes; i++) {

			for (int j = 1; j < arrIn[i].length; j++) {
				int source = arrIn[i][0];
				int dest = arrIn[i][j];
				List<Integer> nodeList = new ArrayList<>();
				System.out.println(" processing !" + source + " -> " + dest);
				System.out.println("NodeList");
				nodeList.stream().forEach(System.out::print);
				if (nodes.containsKey(dest) && nodeList.contains(source)) {
					nodes.entrySet().forEach(n -> System.out.print(n.getKey() + " -> " + n.getValue() + " "));
					System.out.println(" cycle found !" + source + "->" + dest);
					if (dest > source  ) {
						listIn.add(source);
						listIn.add(dest);	
					} else {
						listIn.add(dest); listIn.add(nodes.get(dest));	
						nodes.remove(dest);
						nodes.put(source, dest);
					}

				} else {
					nodes.put(source, dest);
					
				}
				if(! nodeList.contains(source)) nodeList.add(source);		
				if(! nodeList.contains(dest)) nodeList.add(dest);
			}
		}
		
		int[] outArry = new int[listIn.size()];
		int eachelem =0;
		for(Integer eachInt : listIn) {
			outArry[eachelem] = eachInt;eachelem++;
			
		}
		nodes.entrySet().forEach(n -> System.out.print(n.getKey() + " -> " + n.getValue() + " "));
		return outArry;
	}

}
