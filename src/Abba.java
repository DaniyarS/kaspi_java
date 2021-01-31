import java.util.Scanner;

public class Abba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();

        long max = max(a, b, c);

        System.out.println(max);
    }

    static long max(long a, long b, long c) {
        long max;

        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        return max;
    }
}
