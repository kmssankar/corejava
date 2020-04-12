package org.advanced.lamdaExpressions;

@FunctionalInterface
interface perfmutiply {
	public int multiplynum(int a, int b);
}

@FunctionalInterface
interface perfgreeting {
	public String greetPerson(String name);
}

public class LambdaExpression {
	public static void main(String[] args) {
		perfmutiply p = (int a, int b) -> (a * b);
		perfgreeting g= (String a)-> "Hello "+ a;
		//without Type declaration
		perfgreeting g2 = a-> "Hellowww !! "+ a;
		System.out.println("Lambda Display  -> " + p.multiplynum(12, 22));
		System.out.println("Lambda Greeting -> " + g.greetPerson("Sankar "));
		System.out.println("Lambda Greeting without Type Decl -> " + g2.greetPerson("Sankar "));
	}
}

/* Output
   Lambda Displry -> 264
*/