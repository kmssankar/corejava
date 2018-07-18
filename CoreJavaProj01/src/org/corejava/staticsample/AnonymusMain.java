package org.corejava.staticsample;

public class AnonymusMain {

	public static void main(String[] Args)
	{
		AnonymsClass Ac = new AnonymsClass() {
			public void showtest()
			{
				System.out.println("Inside Anonymous Class !!");
			}
		};
		
		Ac.showtest();
	}
}
