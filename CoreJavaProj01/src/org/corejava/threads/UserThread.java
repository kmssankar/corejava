package org.corejava.threads;

public class UserThread {
	final int id = 22;

	public void display(String Sinp) {
		System.out.print("\n Starting of Display Function -- > " + Sinp );
		try
			{
				Thread.sleep(1000);
			} catch (InterruptedException Ex)
			{
				System.out.println("Exception " + Ex);
			}
		System.out.print("]");
	}

}
