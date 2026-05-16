package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
			System.out.println(br.readLine());
		}
		
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
