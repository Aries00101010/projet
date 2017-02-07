package core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Reader {
	FileReader fileReader;
	
	public Reader(File file) {
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Reader() {
		
	}
}
