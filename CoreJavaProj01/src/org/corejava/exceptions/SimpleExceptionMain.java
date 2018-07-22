package org.corejava.exceptions;

public class SimpleExceptionMain {

	public static void main(String[] Args) {
		
		int Inp = 5;
		int Num = 0;
		// Exception Scenario
		int Quot = Inp/Num;
		System.out.println("End of the program");
	}
}

/*OUTPUT
Exception in thread "main" java.lang.ArithmeticException: / by zero
at org.corejava.exceptions.SimpleExceptionMain.main(SimpleExceptionMain.java:10)*/