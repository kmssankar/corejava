package org.corejava.junitbg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTestClass {
	
	@Test
	public void methodTest() {
		String s1 ="Is it equal";
		assertEquals(s1, "Is it equal1");
	}
	@Test
	public void testEmployeeSalaryProcessor() {
		EmployeeSalaryProcessor employeeSalaryProcessor = new EmployeeSalaryProcessor();
		assertEquals(970000.00*143,employeeSalaryProcessor.getUpdatedSalary(970000.00,43),0.01);
	}
}
