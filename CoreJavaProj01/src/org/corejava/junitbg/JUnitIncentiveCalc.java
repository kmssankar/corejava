package org.corejava.junitbg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitIncentiveCalc {	
	@Test
	public void testIncentiveCalc() {
		EmployeeSalaryProcessor employeeSalaryProcessor = new EmployeeSalaryProcessor();
		assertEquals(75000+(75000*90*120*.0001),employeeSalaryProcessor.getIncentive(75000, 95, 120),0.01);	
	}

}
