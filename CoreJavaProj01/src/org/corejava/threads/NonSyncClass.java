package org.corejava.threads;

public class NonSyncClass extends Thread{

	UserThread Usrthrd;
	String Msg;
	NonSyncClass(UserThread UST , String MsgIn)
	{
		Usrthrd = UST;
		Msg = MsgIn;
		start();
	}
	
	public void run()
	{
		Usrthrd.display(Msg);
	}
}
