package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample1 {
	
	public static void readFile() throws FileNotFoundException{
		FileReader fr = new FileReader("abc.txt");
	}

	public static void main(String[] args) {
		try {
			readFile();
		}
		
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
	}

}
