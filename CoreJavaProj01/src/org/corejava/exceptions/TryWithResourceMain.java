package org.corejava.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceMain {

	public static void main(String[] args) {
		try(BufferedReader Br = new BufferedReader(new FileReader("TextInp1.txt")))
		{
			String Str;
			while ((Str = Br.readLine()) != null)
				{
					System.out.println(Str);
				}
		} catch (IOException Fe)
		{
			System.out.println("Io exception Occured !!");
		}
	System.out.println("End of the program !!");

	}

}
