package org.corejava.oops;

class A{
	public A(int i) {
		a=i;
	}
	int a;
}

class B extends A{
	public B(int i) {
		super(i);
		
	}

	int b;
}

class C{
	A a =new A(5);
	
	public A getA() {
		return a;
	}
	
}

public class CheckInheritMain {

	C c = new C();
	final B b = (B) c.getA();
}
