package org.corejava.exceptions;

public class SimpleHandledExeptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Inp = 5;
		int Num = 0;
		// Exception Scenario
		try
		{
		int Quot = Inp/Num;
		}
		catch(ArithmeticException E)
		{
			System.out.println("Divide by Zero exception occured ");
		}
		System.out.println("End of the program");
	}

}
