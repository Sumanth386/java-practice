package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WithoutTryWithResourcesExample {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("test.txt"));
			
			System.out.println(br.readLine());
		}
		
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			try {
				if(br != null) {
					br.close();
				}
			}
			
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
