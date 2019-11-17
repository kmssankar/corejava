package org.corejava.junitbg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitExpectedExceptions {
	
	@Test(expected=ArithmeticException.class)
	public void testgetVariableIndAmtCase1()
	{
		EmployeeSalaryProcessor employeeSalaryProcessor = new EmployeeSalaryProcessor();
		
		assertEquals(75000,employeeSalaryProcessor.getVariableIndAmt(75000, 0),.001);	
	}	
	@Test
	public void testgetVariableIndAmtCase2()
	{
		EmployeeSalaryProcessor employeeSalaryProcessor = new EmployeeSalaryProcessor();
		assertEquals(75000*140/365,employeeSalaryProcessor.getVariableIndAmt(75000, 140),.2);	
	}

}
