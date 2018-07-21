package com.corejava.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Course CrsIInst = new Course(12 ," Core Java ","Computer Engineering");
      FileOutputStream FOS;
	try
		{
			FOS = new FileOutputStream("Crs.TXT");
			ObjectOutputStream OOS = new ObjectOutputStream(FOS);
		     OOS.writeObject(CrsIInst);
		      OOS.close();
		      FOS.close();
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
      
	}

}
