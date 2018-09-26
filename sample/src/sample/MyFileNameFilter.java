package sample;

import java.io.File;
import java.io.FilenameFilter;

public class MyFileNameFilter implements FilenameFilter{

	@Override
	public boolean accept(File f, String name) {
		return name.contains("1");
	}

}
