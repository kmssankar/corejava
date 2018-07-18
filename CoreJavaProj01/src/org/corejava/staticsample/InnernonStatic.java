package org.corejava.staticsample;

public class InnernonStatic {

	int id;
	
	public void showintVal()
	{
		System.out.println("Inside Class" + this.getClass());
	}
	class innerclass
	{
		int IdInner;
		
		public void showInnerId()
		{
			System.out.println("Inside Class" + this.getClass());
		}
	}
}
