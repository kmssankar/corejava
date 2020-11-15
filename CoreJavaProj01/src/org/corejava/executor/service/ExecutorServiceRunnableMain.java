package org.corejava.executor.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Runnable{
	
	int threadNum;
	
	MyThread(int threadRun){
		this.threadNum = threadRun;
	}

	@Override
	public void run() {
		System.out.println(" Thread Started ThreadNum : " +threadNum+" - "+  Thread.currentThread().getId());
		try {
			Thread.sleep(1699);
			System.out.println(" Thread Ended   ThreadNum : " +threadNum+" - "+   Thread.currentThread().getId());
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}

public class ExecutorServiceRunnableMain {

	public static void main(String[] args) {

		Runnable runnableTask = () -> {
			try {
				System.out.println("Thread Started   : " + Thread.currentThread().getId() + " : "
						+ Thread.currentThread().getName());
				Thread.sleep(2000);
				System.out.println("Thread Completed : " + Thread.currentThread().getId() + " : "
						+ Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		};

		ExecutorService executorService = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 15; i++) {
			executorService.execute(new MyThread(i));
		}
		executorService.shutdown();
		while (!executorService.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}

}
