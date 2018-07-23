package org.corejava.exceptions;

import java.io.IOException;

public class ExceptionInitCause {

	public int divide(int i , int j)
	{
		if(j<1)
			{ 
				ArithmeticException AE = new ArithmeticException(" Divide By Zero");
				AE.initCause(new IOException(" Cause is IO Read"));
				throw AE;
			}
		else
			{
				return i/j;
			}
	}
}
