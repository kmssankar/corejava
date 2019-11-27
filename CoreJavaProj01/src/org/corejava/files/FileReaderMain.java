package org.corejava.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("TextInp.txt"))){
			String str;
				while((str=br.readLine())!=null) {
					System.out.println(str);
				}
			} catch (FileNotFoundException e){
				e.printStackTrace();
			} catch (IOException e){
				e.printStackTrace();
			}
	}

}
