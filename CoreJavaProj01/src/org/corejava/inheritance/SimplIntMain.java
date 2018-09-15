package org.corejava.inheritance;

public class SimplIntMain {

	public static void main(String[] args) {
		
		//Using Interface
		Simple simpInst = new SimpleImpl();
		simpInst.showActualDetails();
		Simple.showDetails();
		
		//Using Implemented Class
		SimpleImpl simpleImplInst = new SimpleImpl();
		simpleImplInst.SimplImplMethod();
		simpleImplInst.showActualDetails();
	}
}

/*OUTPUT:
	The Actual Detail !!
	This Is Static one !!
	The simple Impl Method !
	The Actual Detail !!*/