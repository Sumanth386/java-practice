package loops;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int temp = n;
        int count = 0;

        // Step 1: Count digits
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        temp = n;
        int sum = 0;

        // Step 2: Calculate Armstrong sum
        while (temp > 0) {
            int digit = temp % 10;

            int power = 1;

            // Manual power calculation
            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }

            sum += power;

            temp = temp / 10;
        }

        // Step 3: Check result
        if (sum == n) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

        sc.close();
    }
}