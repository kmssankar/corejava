package org.corejava.threads;

public class ThreadMainClass {
	
	public static void main(String[] Args)
	{
	ThreadExtendClass TEInstance1 = new ThreadExtendClass();
	ThreadExtendClass TEInstance2 = new ThreadExtendClass();
	TEInstance1.setName("1ST CHILD THREAD FROM MAIN");
	TEInstance1.setPriority(10);
	TEInstance1.start();
	try
	{
		TEInstance1.join(500);
	}
	catch(InterruptedException Ex)
	{
		System.out.println("Catched Intrupted " + Ex);
	}
	TEInstance2.setName("2 ND CHILD THREAD FROM MAIN");
	TEInstance2.setPriority(10);
	TEInstance2.start();
	
	if(TEInstance1.isAlive())
	{
		System.out.println("TEInstance is Alive " + TEInstance1.getName());
	}
	}
}
/*-- OUTPUT__
In Alive State : Thread[Child Thread,10,main]
TEInstance is Alive 1ST CHILD THREAD FROM MAIN
In Alive State : Thread[Child Thread,10,main]
Value of X 7 thread name : Thread[1ST CHILD THREAD FROM MAIN,10,main]
Value of X 7 thread name : Thread[2 ND CHILD THREAD FROM MAIN,10,main]
Value of X 3 thread name : Thread[1ST CHILD THREAD FROM MAIN,10,main]
Value of X 3 thread name : Thread[2 ND CHILD THREAD FROM MAIN,10,main]
Value of X 4 thread name : Thread[1ST CHILD THREAD FROM MAIN,10,main]
Value of X 4 thread name : Thread[2 ND CHILD THREAD FROM MAIN,10,main]
Value of X 5 thread name : Thread[1ST CHILD THREAD FROM MAIN,10,main]
Value of X 5 thread name : Thread[2 ND CHILD THREAD FROM MAIN,10,main]
Value of X 1 thread name : Thread[1ST CHILD THREAD FROM MAIN,10,main]
Value of X 1 thread name : Thread[2 ND CHILD THREAD FROM MAIN,10,main]

*/