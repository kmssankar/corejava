package org.corejava.exceptions;

import java.io.IOException;

public class SubClassExceptionUnchecked extends SuperClass{

	public void Display() throws ArrayIndexOutOfBoundsException
	  {
		  System.out.println(" Subclass Display !! ");
	  }
}
