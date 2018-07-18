package org.corejava.staticsample;

public class InnerNonStaticMain {
	
	public static void main(String[] Args) {
		
		InnernonStatic InrNS = new InnernonStatic();
		InrNS.showintVal();
		
		InnernonStatic.innerclass Incr = InrNS.new innerclass();
		Incr.showInnerId();
	}

}
