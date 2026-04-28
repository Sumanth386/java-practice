package bankapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Bank Account System");

        System.out.print("Enter the account holder name: ");
        sc.nextLine(); // clear buffer
        acc.accountHolder = sc.nextLine();

        System.out.print("Enter initial balance: ");
        acc.balance = sc.nextInt();

        int choice;

        do {
            System.out.println("\nAccount Holder: " + acc.accountHolder);
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int dep = sc.nextInt();
                    acc.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int wd = sc.nextInt();
                    acc.withdraw(wd);
                    break;

                case 3:
                    acc.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you, visit again!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("----------------------------");

        } while (choice != 4);

        sc.close();
    }
}