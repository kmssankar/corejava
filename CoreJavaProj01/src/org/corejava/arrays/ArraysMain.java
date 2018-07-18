package org.corejava.arrays;
import java.util.*;

import org.corejava.variables.VariablesClass;
public class ArraysMain {

	public static void main(String[] args) {
		// class to check arrays and behaviour
		
		int[] intArray= {1,5,3,4,7,0};
		char[] CharArray = {'a','c','d'};
		double[] doubleArray = {12.0,13.0};
		float[] floatArr = {7.12f,2.34f};
		//Sorting
		Arrays.sort(intArray,0,3);
		System.out.println("Intarry : " + intArray[0]+intArray[1]+intArray[2]);
		Arrays.sort(intArray,0,1);
		System.out.println("Intarry : " + intArray[0]+intArray[1]+intArray[2]);
		Arrays.sort(CharArray);
		System.out.println("CharArray : " + CharArray[0]+CharArray[1]+CharArray[2]);
		Arrays.sort(doubleArray);
		System.out.println("doubleArray : " + doubleArray[0]+doubleArray[1]);
		Arrays.sort(floatArr);
		System.out.println("floatArr : " + floatArr[0]);
       //Searching
		System.out.println("Searching by Binary 5 "+ Arrays.binarySearch(intArray, 5));
		System.out.println("Searching by Binary 7 " + Arrays.binarySearch(intArray, 7));
	  // iteration example
		for(int x : intArray)
		{
			System.out.println(x);
		}
		//jagged Array
		// 3 rows and unknown cols which will be declared later using new Keyword
		int[][] Jagged = new int[3][];
		Jagged[0] = new int[3];
		Jagged[1] = new int[2];
		
		VariablesClass[] varArr = {new VariablesClass() };
		varArr[0].functions();
	}

}
