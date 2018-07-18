package org.corejava.callby;

public class MethodsClass {
 
	public void modifyint(int i)
	{
		i = i+5;
		System.out.println("Value of i in "+ i + " "+ this.getClass());
	}
	
	public void ModifyUsr(User usr)
	{
		usr.setId(22);
	}
}
