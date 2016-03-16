/**
 * Created by Aditya on 16-Mar-16.
 */
public class Fibonacci {

    private long fiboSum = 0;

    public Fibonacci(int n) {
        int first = 0;
        int second = 1;
        int current = 0;
        while (current < n) {
            current = first + second;
            if (current % 2 == 0)
                fiboSum += current;
            first = second;
            second = current;
        }
    }

    public void displaySum() {
        System.out.println(fiboSum);
    }
}
