package org.corejava.probsolv.domain;

public class MainJJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10,y=20;
		if(x>y);
		int[] intArr = new int[10];
		char[] s3 = new char[5];
		String s1= "hello";
		s1.getChars(2, 5, s3, 0);
		System.out.println("s3 " +s3.length );
		for(char s:s3) {
			System.out.println(s);
		}
		String s2 = s1.replace("l", "L");
		System.out.println(s1 + " " + s2);
		System.out.println(intArr[1]);
		System.out.println("test");
		int[] a = {1,2,3,4};
		//int k = a[3]/a[4];
		int x1=10 ,y1 =5,sum=0;
		while(y1++ < --x1) {
			y++;
			sum = x1+y1;
					System.out.println(sum);
					x--;
		}
		

	}

}
