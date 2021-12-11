import java.util.Scanner;
import java.util.Vector;

public class Median {

    public static long gcdCalc(long a, long b) {
        // Everything divides 0
        if (a == 0 || b == 0)
            return 0;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcdCalc(a-b, b);

        return gcdCalc(a, b-a);
    }

    static boolean isCoPrime(int a, int b) {
        return gcdCalc(a, b) == 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Vector<Integer> testCases = new Vector<>();

        for (int i = 0; i < n; i++) {
            testCases.add(sc.nextInt());
        }

        for (Integer testCase : testCases) {
            Vector<Integer> list = new Vector<>();

            System.out.println("testCase " + testCase);

            for (int j = 1; j < testCase; j++) {
                if (isCoPrime(j, testCase)) {
                    list.add(j);
                }
            }

            System.out.println(list);

            if (list.size() % 2 == 0) {
                System.out.println(list.size() / 2);
            } else {
                System.out.println((list.size() + 1) / 2);
            }
        }
    }
}
