package org.corejava.threads;

public class ThrdRnbleMain {

	public static void main(String[] args) {
		ThreadUsngRunnable MyThrdRunnable = new ThreadUsngRunnable();
		Thread TxRun = new Thread(MyThrdRunnable);
		TxRun.setName("Thread from main");
		TxRun.setPriority(4);
		TxRun.start();
		if(TxRun.isAlive())
			{
				System.out.println(" IN ALIVE STATE : " + TxRun);
			}
	}
}

/*output
 IN ALIVE STATE : Thread[Thread from main,4,main]
Value of X 7
Value of X 3
Value of X 4
Value of X 5
Value of X 1*/