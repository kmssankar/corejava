package org.advanced.methodrefernces;

import java.util.function.BiFunction;

class Greet{
	
	Greet(String s){
		System.out.println("Hello Programmer " + s);
	}
}

interface ConstInterface{
	public void greetMessage(String s);
}

interface InstInterface{
	public String greetMessage(String s);
}
public class MethodReferenceMain {
    //Instance reference interface
	
	public static void main(String[] args) {
		
		//Using Instance method as method Reference
		InstanceClass instanceClass = new InstanceClass();
		InstInterface instInterface = instanceClass::showStatus;
		System.out.println(instInterface.greetMessage("Sankar"));
		
		//using Static method as Method reference 
		InstInterface staticInterface =MethodReferenceMain::showWelcome;
		System.out.println(staticInterface.greetMessage("Larry Ellision !!"));
		
		//constructor method reference
		ConstInterface constInterface = Greet::new;
		constInterface.greetMessage(" To Java 8" );
		
		//method of an arbitrary object
		InstInterface instInterface2 = String::toUpperCase;
		System.out.println(instInterface2.greetMessage("test lower to Upper"));
	}
	
	 static String showWelcome(String str) {
		return "welcome .. " + str;
	}

}

/*
Hello !! Sankar .. Have a good Day !!
welcome .. Larry Ellision !!
Hello Programmer  To Java 8
TEST LOWER TO UPPER
 */
  
