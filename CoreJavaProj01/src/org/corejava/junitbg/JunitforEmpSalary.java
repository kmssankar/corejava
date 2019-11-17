package org.corejava.junitbg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitforEmpSalary {	
	@Test
	public void testEmpSalaary() {
		EmployeeSalaryProcessor employeeSalaryProcessor = new EmployeeSalaryProcessor();
		assertEquals(970000.00*143,employeeSalaryProcessor.getUpdatedSalary(970000.00,43),0.01);	
	}

}
