package org.corejava.threads;

import java.util.Date;

public class ThreadPoolThread implements Runnable{
	
	String threadmsg ;
	public ThreadPoolThread(String threadMsg) {
		this.threadmsg = threadMsg;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Started  "+threadmsg+ " " + new Date());
		doAction();
		System.out.println(Thread.currentThread().getName() + " Completed !  " +threadmsg+ " " +  new Date());
		
	}

	private void doAction() {
		
		try
			{
				Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		
	}
}
