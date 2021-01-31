import java.util.Scanner;

public class DiagonalSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        int result = diagonalSum(mat);

        System.out.println(result);
    }

    public static int diagonalSum(int[][] mat) {
        if (mat.length == 1) {
            return mat[0][0];
        }

        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
        }

        int k = 0;
        if (mat.length % 2 != 0) {
            for (int j = mat.length - 1; j >= 0; j--) {
                if (j != ((mat.length - 1) / 2) && k != ((mat.length - 1) / 2)) {
                    sum += mat[k][j];
                }
                k++;
            }
        } else {
            for (int j = mat.length - 1; j >= 0; j--) {
                sum += mat[k][j];
                k++;
            }
        }

        int c = mat.length - 1;

        int res = 0;

        for (int i = 0; i < mat.length; i++) {
            if (i != c) {
                res += mat[i][i] + mat[c][i];
            } else {
                res += mat[i][i];
            }
            c--;
        }

        return res;
    }
}
