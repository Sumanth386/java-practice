package methods;

import java.util.Scanner;

public class NumberValidation {

    public static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

    public static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;   // FIXED
            sum += digit;
            temp = temp / 10;
        }

        return sum;
    }

    public static int reverseNumber(int number) {
        int reverse = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp/ 10;
        }

        return reverse;
    }

    public static void checkPalindrome(int number) {
    	int reversed = reverseNumber(number);
    	
    	if(number == reversed) {
    		System.out.println("Palindrome");
    	}else {
    		System.out.println("Not a palindrome");
    	}
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        evenOrOdd(number);
        positiveOrNegative(number);

        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);

        int reverse = reverseNumber(number);
        System.out.println("Reverse: " + reverse);

        checkPalindrome(number);
        
        sc.close();
    }
}