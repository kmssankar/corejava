package org.corejava.executor.service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class MyCallable implements Callable<String>{
	int threadId;
	
	MyCallable(int threadId){
		this.threadId = threadId;
	}

	@Override
	public String call() throws Exception {
		try {
			Thread.sleep(2000);
			System.out.println("Thread Completed : "+Thread.currentThread().getId());
		}catch (InterruptedException e) {
		}
		return "Thread Completed : "+ threadId;
	}
	
}

public class ExecutorServiceCallableMain {

	public static void main(String[] args) {
		System.out.println(" Started App : "+ LocalTime.now());
		ExecutorService threadPoolExec =  Executors.newFixedThreadPool(5);
		List<Future<String>> outPut = new ArrayList<>();
		
		for(int i=1;i<=15;i++) {
			
			Future<String > future =threadPoolExec.submit(new MyCallable(i));
			System.out.println(" Started thread : " + i);
			outPut.add(future);
		}
		/*
		 * try { threadPoolExec.awaitTermination(20, TimeUnit.SECONDS); } catch
		 * (InterruptedException e1) { // TODO Auto-generated catch block
		 * e1.printStackTrace(); }
		 */
			threadPoolExec.shutdown();
			outPut.forEach(n -> {
				try {
					System.out.println(n.get());
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
			});
			System.out.println(" Ended App : "+ LocalTime.now());
	}
	
	
}
