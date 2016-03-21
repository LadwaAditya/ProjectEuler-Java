package source;

/**
 * Sum square difference
 * Problem 6
 * The sum of the squares of the first ten natural numbers is,
 * <p>
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * <p>
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * <p>
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * Created by Aditya on 21-Mar-16.
 */
public class SumSquareDiff {
    private long sumSquareDiff = 0;
    private long sumSquare = 0;
    private long squareSum = 0;

    public SumSquareDiff() {
        for (int i = 1; i <= 100; i++) {
            sumSquare += i * i;
            squareSum += i;
        }
        squareSum = squareSum * squareSum;
        sumSquareDiff = squareSum - sumSquare;
    }

    public void displaySumSquareDiff() {
        System.out.println(sumSquareDiff);
    }
}
