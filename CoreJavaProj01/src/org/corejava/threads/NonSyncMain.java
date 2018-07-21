package org.corejava.threads;

/* 
 *   To verify the behaviour of thread when Synchronous is not used.
 * 
 * REFER CLASSES 
 *    NonSyncClass
 *    UserThread 
 * */
public class NonSyncMain {

	public static void main(String[] args) {
		UserThread UST01 = new UserThread();
		NonSyncClass NonSyn1 = new NonSyncClass(UST01,"INPUT 1");
		NonSyncClass NonSyn2 = new NonSyncClass(UST01,"INPUT 2");
		NonSyncClass NonSyn3 = new NonSyncClass(UST01,"INPUT 3");
	}
}

/*OUTPUT
 Starting of Display Function -- > INPUT 1
 Starting of Display Function -- > INPUT 2
 Starting of Display Function -- > INPUT 3]]]*/