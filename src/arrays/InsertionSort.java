package arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 2, 1};

        System.out.print("Array before sorting: ");
        print(arr);

        // Insertion Sort Logic
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];     // element to insert
            int j = i - 1;

            // shift elements to right
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // place key at correct position
            arr[j + 1] = key;
        }

        System.out.print("Array after sorting: ");
        print(arr);
    }

    // method to print array
    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}