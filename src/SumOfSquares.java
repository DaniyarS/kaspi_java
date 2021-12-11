import java.util.Scanner;

public class SumOfSquares {

    static int sumOfS(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (i * i);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dig1 = sc.nextInt();

        System.out.println(sumOfS(dig1));
    }
}
