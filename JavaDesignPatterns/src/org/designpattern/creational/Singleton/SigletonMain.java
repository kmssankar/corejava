package org.designpattern.creational.Singleton;

/*SINGLETON DESIGN PATTERN:
	
	Only one instance of the obect will be available per JVM.
	*/
public class SigletonMain {

	public static void main(String[] Args)
	{
		SingletonClass Sing = SingletonClass.getInstance();
		System.out.println(Sing.toString());
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException E)
		{
			E.printStackTrace();
		}
		
		SingletonClass Sing1 = SingletonClass.getInstance();
		System.out.println(Sing1.toString());
	}
}
 