package org.corejava.callby;

public class CallbyMain {

	public static void main(String[] args) {	
		int id = 12;
		MethodsClass MthdClass = new MethodsClass();
		// call by Value
		MthdClass.modifyint(id);
		System.out.println("Value of id : " + id);
		User Usr = new User(12,"TestUsr");
		//Call by Reference
		MthdClass.ModifyUsr(Usr);
		System.out.println("User : " + Usr);
	}
}
