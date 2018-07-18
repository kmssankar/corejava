package org.corejava.variables;

public class VariableClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
	  String SetStaticValue = VariablesClass.Type;	
      VariablesClass Myclass = new VariablesClass();
      
      Myclass.functions();
      Myclass.Type ="Modified one";
      System.out.println("Static Variable Value " + SetStaticValue);
      
      String SetStaticValueAf = VariablesClass.Type;	
      System.out.println("Static Variable Value after Changing : " + SetStaticValueAf);
      
      VariablesClass MyclassAft = new VariablesClass();
      System.out.println("Static Variable Value after mod " + MyclassAft.Type + " Instance "+MyclassAft.getClass());
      
	}

}
