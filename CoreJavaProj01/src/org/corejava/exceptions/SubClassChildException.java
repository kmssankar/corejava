package org.corejava.exceptions;

import java.io.IOException;


/*If Super class method throws an exception, 
 * then Subclass overriden method can throw the same exception or no exception, 
 * but must not throw parent exception of the exception thrown by Super class method.

It means, if Super class method throws object of NullPointerException class,
 then Subclass method can either throw same exception, or can throw no exception, 
 but it can never throw object of Exception class (parent of NullPointerException class).*/

public class SubClassChildException {

	public void Display() throws IOException
	{
		System.out.println("Super Class Display");
	}
}
