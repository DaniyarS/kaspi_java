import java.util.Arrays;
import java.util.Scanner;

public class FlipImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                arr[i][j] = sc.nextInt();

        int[][] res = flipAndInvertImage(arr);

        System.out.println(Arrays.deepToString(res));
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int[][] reverse = new int[A.length][A.length];

        for (int i = 0; i < A.length; i++) {
            int k = 0;
            for (int j = A.length - 1; j >= 0; --j) {
                if (A[i][j] == 0) reverse[i][k] = 1;
                else reverse[i][k] = 0;
                k++;
            }
        }
        return reverse;
    }
}
