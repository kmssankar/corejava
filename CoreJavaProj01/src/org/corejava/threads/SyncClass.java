package org.corejava.threads;

public class SyncClass extends Thread {
	UserThread Usrthrd;
	String Msg;

	SyncClass(UserThread UST, String MsgIn) {
		Usrthrd = UST;
		Msg = MsgIn;
		start();
	}
	public void run() {
		synchronized (Usrthrd)
			{
				Usrthrd.display(Msg);
			}
	}

}
