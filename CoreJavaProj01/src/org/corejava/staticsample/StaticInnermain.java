package org.corejava.staticsample;

public class StaticInnermain {
  public static void main(String[] Args)
  {
	StaticInnerClass StInr = new StaticInnerClass();
	StInr.showintVal();
	
	StaticInnerClass.innerclass InnerClass = new StaticInnerClass.innerclass();
	InnerClass.showInnerId();
  }
	
}
