package loops;

public class CountingPrimeNumberInRange {

    public static void main(String[] args) {

        int primeCount = 0;

        for(int i = 1; i <= 10; i++) {

            int count = 0;

            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }

            if(count == 2) {
                primeCount++;
            }
        }

        System.out.println("Total Prime Numbers = " + primeCount);
    }
}
