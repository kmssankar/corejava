package org.corejava.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for(int i=1;i<=25;i++) {
			Runnable runnable = new ThreadPoolThread("Thread " + i);
			executorService.execute(runnable);
		}
		  executorService.shutdown();
		  while(!executorService.isTerminated()) {}
			  System.out.println("All threads Done !!");
		}

}


/*pool-1-thread-5 Started  Thread 5 Mon Apr 13 00:10:30 IST 2020
pool-1-thread-3 Started  Thread 3 Mon Apr 13 00:10:30 IST 2020
pool-1-thread-1 Started  Thread 1 Mon Apr 13 00:10:30 IST 2020
pool-1-thread-2 Started  Thread 2 Mon Apr 13 00:10:30 IST 2020
pool-1-thread-4 Started  Thread 4 Mon Apr 13 00:10:30 IST 2020
pool-1-thread-3 Completed !  Thread 3 Mon Apr 13 00:10:32 IST 2020
pool-1-thread-5 Completed !  Thread 5 Mon Apr 13 00:10:32 IST 2020
pool-1-thread-3 Started  Thread 6 Mon Apr 13 00:10:32 IST 2020
pool-1-thread-5 Started  Thread 7 Mon Apr 13 00:10:32 IST 2020
pool-1-thread-1 Completed !  Thread 1 Mon Apr 13 00:10:32 IST 2020
pool-1-thread-4 Completed !  Thread 4 Mon Apr 13 00:10:32 IST 2020
pool-1-thread-2 Completed !  Thread 2 Mon Apr 13 00:10:32 IST 2020
pool-1-thread-4 Started  Thread 9 Mon Apr 13 00:10:32 IST 2020
pool-1-thread-2 Started  Thread 10 Mon Apr 13 00:10:32 IST 2020
pool-1-thread-1 Started  Thread 8 Mon Apr 13 00:10:32 IST 2020
pool-1-thread-5 Completed !  Thread 7 Mon Apr 13 00:10:34 IST 2020
pool-1-thread-3 Completed !  Thread 6 Mon Apr 13 00:10:34 IST 2020
pool-1-thread-3 Started  Thread 11 Mon Apr 13 00:10:34 IST 2020
pool-1-thread-4 Completed !  Thread 9 Mon Apr 13 00:10:34 IST 2020
pool-1-thread-5 Started  Thread 12 Mon Apr 13 00:10:34 IST 2020
pool-1-thread-1 Completed !  Thread 8 Mon Apr 13 00:10:34 IST 2020
pool-1-thread-4 Started  Thread 13 Mon Apr 13 00:10:34 IST 2020
pool-1-thread-2 Completed !  Thread 10 Mon Apr 13 00:10:34 IST 2020
pool-1-thread-1 Started  Thread 14 Mon Apr 13 00:10:34 IST 2020
pool-1-thread-2 Started  Thread 15 Mon Apr 13 00:10:34 IST 2020
pool-1-thread-3 Completed !  Thread 11 Mon Apr 13 00:10:36 IST 2020
pool-1-thread-3 Started  Thread 16 Mon Apr 13 00:10:36 IST 2020
pool-1-thread-5 Completed !  Thread 12 Mon Apr 13 00:10:36 IST 2020
pool-1-thread-4 Completed !  Thread 13 Mon Apr 13 00:10:36 IST 2020
pool-1-thread-5 Started  Thread 17 Mon Apr 13 00:10:36 IST 2020
pool-1-thread-4 Started  Thread 18 Mon Apr 13 00:10:36 IST 2020
pool-1-thread-1 Completed !  Thread 14 Mon Apr 13 00:10:36 IST 2020
pool-1-thread-2 Completed !  Thread 15 Mon Apr 13 00:10:36 IST 2020
pool-1-thread-1 Started  Thread 19 Mon Apr 13 00:10:36 IST 2020
pool-1-thread-2 Started  Thread 20 Mon Apr 13 00:10:36 IST 2020
pool-1-thread-3 Completed !  Thread 16 Mon Apr 13 00:10:38 IST 2020
pool-1-thread-3 Started  Thread 21 Mon Apr 13 00:10:38 IST 2020
pool-1-thread-5 Completed !  Thread 17 Mon Apr 13 00:10:38 IST 2020
pool-1-thread-5 Started  Thread 22 Mon Apr 13 00:10:38 IST 2020
pool-1-thread-4 Completed !  Thread 18 Mon Apr 13 00:10:38 IST 2020
pool-1-thread-4 Started  Thread 23 Mon Apr 13 00:10:38 IST 2020
pool-1-thread-2 Completed !  Thread 20 Mon Apr 13 00:10:38 IST 2020
pool-1-thread-1 Completed !  Thread 19 Mon Apr 13 00:10:38 IST 2020
pool-1-thread-2 Started  Thread 24 Mon Apr 13 00:10:38 IST 2020
pool-1-thread-1 Started  Thread 25 Mon Apr 13 00:10:38 IST 2020
pool-1-thread-3 Completed !  Thread 21 Mon Apr 13 00:10:40 IST 2020
pool-1-thread-4 Completed !  Thread 23 Mon Apr 13 00:10:40 IST 2020
pool-1-thread-2 Completed !  Thread 24 Mon Apr 13 00:10:40 IST 2020
pool-1-thread-1 Completed !  Thread 25 Mon Apr 13 00:10:40 IST 2020
pool-1-thread-5 Completed !  Thread 22 Mon Apr 13 00:10:40 IST 2020
All threads Done !!*/
