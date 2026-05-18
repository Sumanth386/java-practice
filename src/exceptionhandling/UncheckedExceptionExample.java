/*	Unchecked Exceptions: These are NOT checked at compile time.
						  They occur during runtime.
						  Compiler does NOT force handling.

	Examples: ArithmeticException
			  NullPointerException
			  ArrayIndexOutOfBoundsException
			  NumberFormatException
*/

package exceptionhandling;

public class UncheckedExceptionExample {

	public static void main(String[] args) {
		try {
			String str = "abc";
			int num = Integer.parseInt(str);
			System.out.println(num);
		}
		
		catch(NumberFormatException e) {
			System.out.println(e.getMessage() + " invalid number format");
		}
	}

}
