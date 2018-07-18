package org.corejava.operators;

public class Operatorsmain {

	public static void main(String[] args) {
		// operators 
		//bitwise 
		int i = 10;
		int bitwiseShift = 2;
		//Bitwise Left shift
		char afterleft = (char) ('A' << bitwiseShift);
		System.out.println("After left of 'A' by 2 " + afterleft);
		//Bitwise right shift
		int afterRight = 10 >> bitwiseShift;
		System.out.println("After right of 10 by 2 " + afterRight);
		//Bitwise Or
		int Oropr = i | bitwiseShift;
		System.out.println("After Oropr  i | bitwiseShift " + Oropr);
		//Bitwise And
		int Andopr = i & bitwiseShift;
		System.out.println("After Andopr i & bitwiseShift " + Andopr);
		//Bitwise XOR
		int Xoropr = i ^ bitwiseShift;
		System.out.println("After Xoropr  i ^ bitwiseShift " + Xoropr);
		//Ternary Operator
        String out= (i==10) ? " i equals to 10 ":"I not equal to 10 ";
        System.out.println("Out Var : "+ out);
	}

}
