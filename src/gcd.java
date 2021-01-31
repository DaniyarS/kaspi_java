import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long ans = gcdCalc(a, b);

        System.out.println(ans);
    }

    public static long gcdCalc(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            long rem = a % b;
            return gcdCalc(b, rem);
        }
    }
}
