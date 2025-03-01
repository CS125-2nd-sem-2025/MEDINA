import java.util.Scanner;

public class Fibo_recursion {
    // Method to calculate the sum of Fibonacci numbers up to n
    static int calculateSum(int n) {
        if (n <= 0) {
            return 0;
        }

        int fibo[] = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;

        int sum = fibo[0] + fibo[1];

        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            sum += fibo[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 20;

        long startTime = System.currentTimeMillis();
        int result = calculateSum(n);
        long endTime = System.currentTimeMillis();

        System.out.println("Sum of Fibonacci numbers up to " + n + " is: " + result);
        System.out.println("Elapsed time: " + (endTime - startTime) + "ms");
    }
}
