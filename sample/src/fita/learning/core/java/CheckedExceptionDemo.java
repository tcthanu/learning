package fita.learning.core.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {
	public static void main(String[] args)  {
		File file =new File("c:/Thanu/Sample.txt");
		try {
			FileReader fr=new FileReader(file);
			int x;
			while( (x = fr.read()) != -1) {
				System.out.print(x);
			}
		} catch(IOException ioe) {
			
		}
	}

}
