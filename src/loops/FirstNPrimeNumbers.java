package loops;

import java.util.Scanner;

public class FirstNPrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 2;

        while(count < n) {

            int factorCount = 0;

            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    factorCount++;
                }
            }

            if(factorCount == 2) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }

        sc.close();
    }
}