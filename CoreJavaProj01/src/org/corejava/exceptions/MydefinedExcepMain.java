package org.corejava.exceptions;

public class MydefinedExcepMain {

	public static void main(String[] args) {
		
		int i=12;
		int j=0;
		
		DefinedExcepFuncClass DefinedFunc = new DefinedExcepFuncClass();
		try
			{
				DefinedFunc.Divide(i,j);
			} catch (MydefinedExcep e)
			{
				System.out.println("Exception : " + e);
			}
		

	}

}
