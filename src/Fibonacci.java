import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long res = fibonacciRes(n);

        System.out.println(res);
    }

    private static long fibonacciRes(int n) {

        long[] numbers = new long[n+1];

        if (n <= 1) {
            return n;
        } else {
            for (int i = 2; i <= n; i++) {
                numbers[i] = fibonacciRes(i-1) + fibonacciRes(i-2);
            }
            return numbers[n];
        }
    }

}
