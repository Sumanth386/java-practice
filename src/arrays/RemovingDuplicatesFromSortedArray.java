package arrays;

import java.util.Scanner;

public class RemovingDuplicatesFromSortedArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter sorted array elements:");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int j = 0;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] != arr[j]) {

                j++;
                arr[j] = arr[i];
            }
        }

        System.out.println("Array after removing duplicates:");

        for(int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}