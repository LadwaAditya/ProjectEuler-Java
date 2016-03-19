package source;

/**
 * Created by Aditya on 18-Mar-16.
 */
public class PrimeNumber {
    private final long limit = 600851475143L;
    private long primeFactor = 0L;

    public PrimeNumber() {
        for (long i = 2; i < limit / 2; i++) {
            if (limit % i == 0)
                checkPrime(i);
        }
    }

    private void checkPrime(long num) {
        for (long j = 2; j < num / 2; j++) {
            if (num % j == 0)
                break;
            else
                primeFactor = num;
        }
        System.out.println(primeFactor);
    }


    public void displayPrimeFactor() {
        System.out.println(primeFactor);
    }
}
