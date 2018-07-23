package org.corejava.exceptions;

public class DefinedExcepFuncClass {

	public int Divide(int i ,int j) throws MydefinedExcep
	{
		if(j<1)
			{
				throw new MydefinedExcep(j);
			}
		else
			{
				return i/j;
			}
	}
}
