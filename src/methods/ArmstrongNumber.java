package methods;

import java.util.Scanner;

public class ArmstrongNumber {

    public static int countDigits(int number) {
        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        return count;
    }

    public static boolean isArmstrong(int number) {
        int temp = number;
        int digitsCount = countDigits(number);
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;

            int power = 1;
            for (int i = 1; i <= digitsCount; i++) {
                power = power * digit;
            }

            sum += power;
            temp = temp / 10;
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Number of digits: " + countDigits(number));

        if (isArmstrong(number)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

        sc.close();
    }
}