package org.corejava.strings;

/*<h>StringBuffer<h>
 * 
Since String is immutable if we create more strings it will use more Heap storage leading to moemory leak
StringBuilder object can be modified.But it is synchronized so thread safe.but the operations are
slower compared to StringBuilder(which is not synchronized)*/
public class StringBufferMain {
	public static void main(String[] args) {
      StringBuffer STRBFR = new StringBuffer("Test String ");
      System.out.println("Before Append : "+ STRBFR);
      STRBFR.append(" Appeneded data ");
      STRBFR.append(12);
      System.out.println("After Append : "+ STRBFR);
      STRBFR.replace(0, 4 , "Replace");
      System.out.println("After Replace : "+ STRBFR);
      STRBFR.delete(1, 6);
      System.out.println("After Delete : "+ STRBFR);
      STRBFR.reverse();
      System.out.println("After Reverse : "+ STRBFR);
      System.out.println("Capacity : "+ STRBFR.capacity());
      /*If the argument of the ensureCapacity() method is less than the existing capacity, 
       * then there will be no change in existing capacity.
      If the argument of the ensureCapacity() method is greater than the existing capacity, 
      then there will be change in the current capacity using following rule: 
      newCapacity = (oldCapacity*2) + 2.*/
      STRBFR.ensureCapacity(22);
      System.out.println("Capacity : "+ STRBFR.capacity());
	}

}
