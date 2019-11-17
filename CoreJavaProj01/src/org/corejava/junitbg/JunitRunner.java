package org.corejava.junitbg;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitRunner {

	public static void main(String[] args) {

		// Run Simple Junit Class JunitTestClass
		Result result01 = JUnitCore.runClasses(JunitTestClass.class,JunitExpectedExceptions.class);
		for (Failure failure : result01.getFailures())
			{
				System.out.println(failure.getMessage());
			}

		// Run Simple Junit Class JunitTestClass
		Result result02 = JUnitCore.runClasses(JunitB4After.class);
		for (Failure failure : result02.getFailures())
			{
				System.out.println(failure.getMessage());
			}
	}

}
