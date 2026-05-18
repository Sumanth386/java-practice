/*
Checked Exceptions: These exceptions are checked by the compiler at compile time.

If not handled: program will NOT compile

You MUST: use try-catch OR use throws
*/

package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("abc.txt");
		}
		
		catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}

}
