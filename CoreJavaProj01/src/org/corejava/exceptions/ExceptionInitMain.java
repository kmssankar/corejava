package org.corejava.exceptions;

public class ExceptionInitMain {

	public static void main(String[] args) {
		int i =10,j =0;
		
		ExceptionInitCause EIC = new ExceptionInitCause();
		try
		{
		EIC.divide(i, j);
		}
		catch(Exception E)
		{
			System.out.println(E.getMessage() + "  ...  Cause : " + E.getCause());
		}
	}
}

/*OUTPUT:
	 Divide By Zero  ...  Cause : java.io.IOException:  Cause is IO Read
*/