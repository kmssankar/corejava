package org.corejava.exceptions;

public class NestedExceptionMain {

	/*NESTED EXCEPTION
	  try catch with in another TRY*/
	public static void main(String[] args) {
		// Nested Exception Main
		try
		{
			int[] Array = {1,2,3};
			int Intval = Array[3];
			try
			{
				int quo = Intval/0;
			}
			catch(ArithmeticException Ex)
			{
				System.out.println("Exception occured : "+ Ex);
			}		
		}
		catch(ArrayIndexOutOfBoundsException Ex)
		{
			System.out.println("Caught Array Index out of Bound");
		}	
	}
}

/*OUTPUT
Caught Array Index out of Bound*/