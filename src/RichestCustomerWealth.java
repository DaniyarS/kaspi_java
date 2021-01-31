import java.util.Scanner;
import java.util.Vector;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[][] accounts = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }

        int answer = getRichest(accounts);

        System.out.println(answer);
    }

    private static int getRichest(int[][] accounts) {
        int max = -1;
        int sum = 0;

        for (int[] account : accounts) {
            for (int i : account) {
                sum += i;
            }
            if (sum >= max) {
                max = sum;
            }
            sum = 0;
        }

        return max;
    }
}
