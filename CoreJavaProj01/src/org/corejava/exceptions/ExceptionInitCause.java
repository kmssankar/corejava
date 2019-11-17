package org.corejava.exceptions;



public class ExceptionInitCause {

	public int divide(int i , int j)
	{
		if(j<1)
			{ 
				ArithmeticException AE = new ArithmeticException(" Divide By Zero");
				AE.initCause(new ArithmeticException(" Cause is IO Read"));
				throw AE;
			}
		else
			{
				return i/j;
			}
	}
}
