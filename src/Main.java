import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x = {3, 5, 6, 9};
        int a = 0, b = 0;
        for (int y : x) {
            if (y % 2 != 0) {
                a += y;
                b++;
            }
        }

        System.out.println("Sum of odd numbers: " + a);
        System.out.println("Count of odd numbers: " + b);
    }
}