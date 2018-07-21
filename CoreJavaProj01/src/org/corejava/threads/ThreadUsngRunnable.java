package org.corejava.threads;

public class ThreadUsngRunnable implements Runnable {	
	@Override
	public void run() {
	  int[] intarr = {7,3,4,5,1};
      
      for(int x : intarr)
      {
    	  System.out.println("Value of X " + x );
      }		
	}
}
