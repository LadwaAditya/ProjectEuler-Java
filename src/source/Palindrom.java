package source;

/**
 * Created by Aditya on 19-Mar-16.
 */
public class Palindrom {

    private long largestPalindrom = 0;

    public Palindrom() {
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                if (isPalindrom(i * j)) {

                    if (largestPalindrom < i * j)
                        largestPalindrom = i * j;
                }
            }
        }

    }

    private boolean isPalindrom(int num) {
        int reverse = 0;
        int orig = num;
        int remainder = 0;
        while (num > 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;

        }
        return reverse == orig;
    }

    public void printPalindrom() {
        System.out.println(largestPalindrom);
    }
}
