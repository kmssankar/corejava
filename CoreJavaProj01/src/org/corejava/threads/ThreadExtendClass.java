package org.corejava.threads;

public class ThreadExtendClass extends Thread {

	public void run() {
		int[] intarr = { 7, 3, 4, 5, 1 };
		Thread tx = new Thread("Child Thread");
		tx.start();
		if (tx.isAlive())
			{
				System.out.println("In Alive State : " + tx);
			}
		for (int x : intarr)
			{
				try
					{
						Thread.sleep(500);
					} catch (InterruptedException ie)
					{
						System.out.println("Exception :  " + ie);
					}

				System.out.println("Value of X " + x + " thread name : " + this);
			}
	}
}
