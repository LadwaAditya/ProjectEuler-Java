package source;

/**
 * Smallest multiple
 * Problem 5
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * Created by Aditya on 20-Mar-16.
 */
public class SmallestMultiple {

    private long smallestMultiple = 20;

    public SmallestMultiple() {
        int n = 20;
        boolean flag = false;
        while (true) {
            for (int i = 2; i <= 20; i++) {
                flag = n % i == 0;
                if (!flag)
                    break;
            }
            if (flag) {
                smallestMultiple = n;
                break;
            }
            n++;
        }
    }

    public void displayMultiple() {
        System.out.println(smallestMultiple);
    }

}
