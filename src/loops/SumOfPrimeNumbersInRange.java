package loops;

public class SumOfPrimeNumbersInRange {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i <= 10; i++) {

            int count = 0;

            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }

            if(count == 2) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of Prime Numbers = " + sum);
    }
}