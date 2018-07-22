package org.corejava.strings;


/*StringBuilder
   Since String is immutable if we create more strings it will use more Heap storage leading to moemory leak
   StringBuilder object can be modified.But it is not synchronized so not thread safe.but the operations are
   faster compared to StringBuffer(which is synchronized)*/
public class StringBuilderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder Strbldr = new StringBuilder(" TEST STRING ");
		Strbldr.append("Appended");
		System.out.println("After Append : "+Strbldr);
		StringBuilder StrbldrRv = Strbldr.reverse();
		String S1 = Strbldr.toString();
		System.out.println("REVERSE  : " + StrbldrRv);
		System.out.println("Assigned to String by toString :" + S1);	
	}
}

/*OUTPUT:
	After Append :  TEST STRING Appended
	REVERSE dedneppA GNIRTS TSET 
	Appended dedneppA GNIRTS TSET Appended
	Assigned to String by toString :dedneppA GNIRTS TSET */