package org.corejava.strings;

/*String is immutable
 *   Once string object is created it cannot be altered .. All wrapper class are Immutable ones.
 *   String is stored in special String Pool in the Heap Memory.
 *   when we create a string without new operator JVM searches in STRING POOL if the same value is present earlier
 *   then it returns the reference to it.
 * 
 * */
public class SimplestringMain {

	public static void main(String[] args) {
		
		String S1 = "Core Java";
		String S2 = "Core Java";
		// Creating using New Operator
		String S3 = new String("Core Java");
		String S4 = new String("Core Java 1");
		String TrimInp = "  Social Economic Policy  ";
		// Comparing Using == operator
		String RESULT = (S1 == S2)?"S1 and S2 are Equal":"S1 and S2 are Not Equal";
        System.out.println(RESULT);
        // Comparing string with String created without new and with new operator
        String RESULT2 = (S1 == S3)?"S1 and S3 are Equal":"S1 and S3 are Not Equal";
        System.out.println(RESULT2);
        
        //Comparing using Equals
        String RESULTE1 = (S1.equals(S2))?"S1 and S2 are Equal":"S1 and S2 are Not Equal";
        System.out.println(RESULTE1);
        // Comparing string with String created without new and with new operator
        String RESULTE2 = (S1.equals(S3))?"S1 and S3 are Equal":"S1 and S3 are Not Equal";
        System.out.println(RESULTE2);
        
        //Comparing with CompareTo operator
        String RESULTCT1 = (S1.compareTo(S2) == 0)?"S1 and S2 are Equal":"S1 and S2 are Not Equal " + S1.compareTo(S2);
        System.out.println(RESULTCT1);
        // Comparing string with String created without new and with new operator
        String RESULTCT2 = (S3.compareTo(S4) == 0)?"S1 and S3 are Equal":"S1 and S3 are Not Equal "+S3.compareTo(S4);
        System.out.println(RESULTCT2);
        
        //some methods in String
        int IntVal = 22;
        System.out.println("Chart At S1.charAt(3)         : "+ S1.charAt(3));
        System.out.println("substring S1.substring(2)     : "+ S1.substring(2));
        System.out.println("substring S1.substring(2,3)   : "+ S1.substring(2,3));
        System.out.println("indexOf S1.indexOf('Java')  : "+ S1.indexOf("Java"));
        System.out.println("indexOf S1.indexOf(\"Java\")  : " + S1.indexOf('J'));
        String IntValStr = String.valueOf(IntVal);
        System.out.println("Valueof IntValStr : " + IntValStr);
        String STRTRIMMED = TrimInp.trim();
        System.out.println("trim of String : |" + STRTRIMMED + "|");
	}
}

/*OUTPUT
S1 and S2 are Equal
S1 and S3 are Not Equal -2
Chart At S1.charAt(3)         : e
substring S1.substring(2)     : re Java
substring S1.substring(2,3)   : r
indexOf S1.indexOf('Java')  : 5
indexOf S1.indexOf("Java")  : 5
Valueof IntValStr : 22
trim of String : Social Economic Policy//
*/