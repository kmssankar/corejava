package org.corejava.junitbg;

public class EmployeeSalaryProcessor {
	public double getUpdatedSalary(double currentSal,double hikePer) {
		return(currentSal *(100 +hikePer));
	}
	
	public double getIncentive(double variablepay , double bunitPerf ,double ratingPercent) {
		
		return(variablepay + (variablepay *bunitPerf * ratingPercent *.0001 ));
		
	}
	public double getVariableIndAmt(double variableComp,int indiadays) {
		if (indiadays ==0)
			{
				throw new ArithmeticException();
			}
		return (variableComp*indiadays/365);
	}
	
}
