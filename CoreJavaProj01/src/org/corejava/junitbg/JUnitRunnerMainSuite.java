package org.corejava.junitbg;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JUnitRunnerMainSuite {

	public static void main(String[] args) {
		Result result01 = JUnitCore.runClasses(TestSuite.class);
		for (Failure failure : result01.getFailures())
			{
				System.out.println(failure.getMessage());
			}
		System.out.println(result01.wasSuccessful());
	}

}
