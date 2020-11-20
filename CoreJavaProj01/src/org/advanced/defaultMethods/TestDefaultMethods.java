package org.advanced.defaultMethods;

interface mydefault{
	public void showOut();
	default void show() {
		System.out.println(" defaut Show ! ");
	}
}

class A implements mydefault {
	
	public void show() {
		System.out.println(" Implemented in A !");
	}
	public void showOut() {
		System.out.println(" Implemented in A!");
	}
}

class B implements mydefault {
	
	public void showOut() {
		System.out.println(" Implemented in B!");
	}
}

public class TestDefaultMethods {

	public static void main(String[] args) {
		
		mydefault my = new A();
		my.show();
		
		mydefault my2 = new B();
		my2.show();
		my2.showOut();
		
	}

}
