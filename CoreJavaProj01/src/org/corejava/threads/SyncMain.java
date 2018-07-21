package org.corejava.threads;

public class SyncMain {
	
	public static void main(String[] Args)
	{
		
		UserThread UST01 = new UserThread();
		SyncClass Sync1 = new SyncClass(UST01,"Line 1");
		SyncClass Sync2 = new SyncClass(UST01,"Line 2");
		SyncClass Sync3 = new SyncClass(UST01,"Line 3");
	}
}

/*OUTPUT:
	Starting of Display Function -- > Line 1]
	Starting of Display Function -- > Line 3]
	Starting of Display Function -- > Line 2]	*/