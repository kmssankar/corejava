package com.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeMain {

	
	public static void main(String[] args)
	{
		Course CSRIN = null;
		try
			{
				FileInputStream FIS = new FileInputStream("Crs.TXT");
				ObjectInputStream OIS = new ObjectInputStream(FIS);
				CSRIN =(Course) OIS.readObject();
				OIS.close();
				FIS.close();
			} catch ( ClassNotFoundException | IOException e)
			{
				
				e.printStackTrace();
			}
		
		//ObjectInputStream OIS = new ObjectInputStream(FIS);
		System.out.println("Course : " + CSRIN.toString());
		
		
		
	}
}
