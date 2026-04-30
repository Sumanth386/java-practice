package methods;

import java.util.Scanner;

public class CheckingPrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        boolean result = isPrime(num);
        
        if(result) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }
    }

    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}