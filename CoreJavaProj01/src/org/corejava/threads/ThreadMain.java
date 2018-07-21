package org.corejava.threads;

public class ThreadMain {

	public static void main(String[] args) {
		// Thread behavior of main class
		
		Thread Txm = new Thread();
		Txm.setName("Main Thread");
        System.out.println("Thread Details : " + Txm);
	}

}

/* output
Thread Details : Thread[Main Thread,5,main]
*/