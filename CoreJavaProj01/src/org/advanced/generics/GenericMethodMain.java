package org.advanced.generics;

import java.util.Arrays;

public class GenericMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] Intarray = {3,5,11,2,0};
		Character[] chararray = {'e','m','c','2'};
		Sort(Intarray);
		Sort(chararray);
		// Display after sort
		Display(Intarray);
		Display(chararray);
		Display(chararray,Intarray);
		
	}

/*	Generic method declarations have a type parameter section delimited 
	by angle brackets (< and >) that precedes the method's return type 
*/	public static <T> void Sort(T[] InpArray)
	{
		Arrays.sort(InpArray);
	}
	
	public static  <T> void Display(T[] InpArray)
	{
		System.out.println("Display " + InpArray.getClass());
		for(T eachelm : InpArray)
			{
				System.out.println(eachelm);
			}
	}
	
	public static  <T,S> void Display(T[] InpArray1 , S[] InpArray2)
	{
		System.out.println("Multiple type parameters ");
		System.out.println("Display " + InpArray1.getClass());
		for(T eachelm : InpArray1)
			{
				System.out.println(eachelm);
			}
		
		System.out.println("Display " + InpArray2.getClass());
		for(S eachelm : InpArray2)
			{
				System.out.println(eachelm);
			}
	}

}

/*OUTPUT:
Display class [Ljava.lang.Integer;
0
2
3
5
11
Display class [Ljava.lang.Character;
2
c
e
m
Multiple type parameters 
Display class [Ljava.lang.Character;
2
c
e
m
Display class [Ljava.lang.Integer;
0
2
3
5
11
*/