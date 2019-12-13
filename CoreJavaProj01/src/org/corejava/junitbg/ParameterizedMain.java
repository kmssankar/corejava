package org.corejava.junitbg;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ParameterizedMain {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(ParameterizedTest.class);
		
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.getMessage());
		}
	}
}
