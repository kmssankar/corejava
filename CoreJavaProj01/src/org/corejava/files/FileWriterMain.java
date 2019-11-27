package org.corejava.files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWriterMain {

	public static void main(String[] args) {

		List<String> filelines = new ArrayList<String>();
		filelines.add("This is test");
		filelines.add("Line 2  got added");
		try(FileWriter fileWriter = new FileWriter("OutTxt.txt")){
			
			for(String line:filelines) {
				fileWriter.write(line +"\n");
			}
			
		} catch (IOException e)
			{
				e.printStackTrace();
			}

	}

}
