package org.corejava.exceptions;

import java.io.IOException;

/*We Cannot throw checked exception in subclass if no such exception is thrown in super class 
when method oerriding is performed.*/
public class SubClassExceptChecked extends SuperClass
{
  public void Display() throws IOException
  {
	  System.out.println(" Subclass Display !! ");
  }
}

/*ERROR:
	Description	Resource	Path	Location	Type
	Exception IOException is not compatible with throws clause in SuperClass.Display()	SubClassExceptChecked.java	/CoreJavaProj01/src/org/corejava/exceptions	line 7	Java Problem
*/