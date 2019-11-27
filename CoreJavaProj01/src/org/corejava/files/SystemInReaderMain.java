package org.corejava.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInReaderMain {
	
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String line;
			while (!(line = br.readLine()).equalsIgnoreCase("quit")) {
				System.out.println("Line Read " + line);
			}
			
		} catch (IOException e)
			{
				e.printStackTrace();
			}
		
	}
}

/*Hello
Line Read Hello
World !!
Line Read World !!
THis is started 
Line Read THis is started 
quit*/

