package org.corejava.exceptions;

public class MydefinedExcep extends Exception{

	private static final long serialVersionUID = 1L;

	int inp;
	MydefinedExcep(int i)
	{
		inp =i;
	}
	@Override
	public String toString() {
		return "MydefinedExcep : Divisor " + inp + " is less than Zero !! ";
	}
}

/*OUTPUT
Exception : MydefinedExcep : Divisor 0 is less than Zero !! */