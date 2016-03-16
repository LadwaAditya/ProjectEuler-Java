/**
 * Created by Aditya on 16-Mar-16.
 */
public class Multiply {
    private long sum = 0;

    public Multiply(int num) {
        for (int i = 0; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                this.sum += i;
        }

    }

    public void displaySum() {
        System.out.println("The sum of multiples is " + sum);
    }
}
