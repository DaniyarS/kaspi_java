import java.util.Scanner;

public class CountMatches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int res = numberOfMatches(num);

        System.out.println(res);
    }

    public static int numberOfMatches(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        int ttlMatches = 0;

        while (n >= 2) {
            if (n % 2 == 0 && n != 2) {
                ttlMatches += n / 2;
                n /= 2;
            } else if (n % 2 != 0){
                ttlMatches += (n - 1) / 2;
                n = ((n-1) / 2) + 1;
            } else if (n == 2) {
                ttlMatches++;
                n--;
            }
        }

        return ttlMatches;
    }
}
