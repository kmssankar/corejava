package org.corejava.staticsample;

public class StaticInnerClass {
int id;
	
	public void showintVal()
	{
		System.out.println("Inside Class" + this.getClass());
	}
	static class innerclass
	{
		int IdInner;
		
		public void showInnerId()
		{
			System.out.println("Inside Class" + this.getClass());
		}
	}
}
