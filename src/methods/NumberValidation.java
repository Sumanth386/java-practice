package methods;

import java.util.Scanner;

public class NumberValidation {

	public static String evenOrOdd(int number) {
		if(number % 2 == 0) {
			return "Even";
		}else {
			return "Odd";
		}
	}

	public static String positiveOrNegative(int number) {
		if (number == 0) {
			return "Zero";
		}
		
		return (number > 0) ? "Positive" : "Negative";
	}
	
    public static int sumOfDigits(int number) {
        int sum = 0;
        int temp = Math.abs(number);

        while (temp != 0) {
            int digit = temp % 10;   // FIXED
            sum += digit;
            temp = temp / 10;
        }

        return sum;
    }

    public static int reverseNumber(int number) {
        int rev = 0;
        int temp = Math.abs(number);

        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp/ 10;
        }

        return (number < 0) ? -rev : rev;
    }

    public static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        System.out.println(evenOrOdd(number));
        System.out.println(positiveOrNegative(number));
        System.out.println("Sum: " + sumOfDigits(number));
        System.out.println("Reverse: " + reverseNumber(number));
        System.out.println("Palindrome: " + isPalindrome(number));
        
        sc.close();
    }
}