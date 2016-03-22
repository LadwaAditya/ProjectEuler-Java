package source;

/**
 * 10001st prime
 * Problem 7
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * <p>
 * What is the 10 001st prime number?
 * Created by Aditya on 22-Mar-16.
 */
public class ThousandPrime {

    private long thousandPrime = 0;

    public ThousandPrime() {
        int n = 2;
        boolean flag = false;
        int count = 0;
        while (true) {
            for (int i = 2; i <= n / 2; i++) {
                flag = n % i == 0;
                if (flag)
                    break;
            }
            if (!flag)
                count++;
            if (count == 10001) {
                thousandPrime = n;
                break;
            }
            n++;
        }
    }

    public void displayThousandPrime() {
        System.out.println(thousandPrime);
    }
}
