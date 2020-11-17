package org.corejava.executor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<String>{
	int threadId;
	
	MyCallable(int threadId){
		this.threadId = threadId;
	}

	@Override
	public String call() throws Exception {
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
		}
		return "Thread Completed : "+ threadId;
	}
	
}

public class ExecutorServiceCallableMain {

	public static void main(String[] args) {
		ExecutorService threadPoolExec =  Executors.newFixedThreadPool(3);
		List<String> outPut = new ArrayList<>();
		
		for(int i=1;i<=15;i++) {
			
			Future<String > future =threadPoolExec.submit(new MyCallable(i));
			try {
				outPut.add(future.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
			//threadPoolExec.awaitTermination(20, TimeUnit.SECONDS);
			threadPoolExec.shutdown();
			outPut.forEach(System.out::println);	
	}
	
	
}
