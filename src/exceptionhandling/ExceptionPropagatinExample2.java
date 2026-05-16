package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionPropagatinExample2 {

	public static void readFile() throws FileNotFoundException{
		FileReader fr = new FileReader("abc.txt");
	}
	
	public static void display() throws FileNotFoundException{
		readFile();
	}
	
	public static void main(String[] args) {
		try {
			display();
		}
		
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
	}

}
