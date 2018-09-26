package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		String dirName = "c:/thanu/test/example";
		File folder = new File(dirName);
		FilenameFilter filter= new MyFileNameFilter();
		FilenameFilter filter2= new FilenameFilter() {
			
			@Override
			public boolean accept(File arg0, String arg1) {
				return arg1.toLowerCase().contains("sample");
			}
		};
		File[] fileList = folder.listFiles(filter);
		for (File file : fileList) {
			System.out.println(file.getName());
		}
		System.out.println("Filter 2 ");
		fileList = folder.listFiles(filter2);
		for (File file : fileList) {
			System.out.println(file.getName());
		}
		// listFiles(f);
	}

	private static void listFiles(File f) {
		if (f.isDirectory()) {
			File[] fileList = f.listFiles();
			for (File s : fileList) {
				// if(s.getName().toLowerCase().endsWith("java"))
				System.out.println(s.getName());
				if (s.isDirectory()) {
					listFiles(s);
				}
			}
		}
	}	
}
