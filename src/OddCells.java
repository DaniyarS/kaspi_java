import java.util.Arrays;
import java.util.Scanner;

public class OddCells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iN = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] indices = new int[2][iN];

        for (int i = 0; i < 2; i ++) {
            for (int j = 0; j < iN; j++)
                indices[i][j] = sc.nextInt();
        }

        int res = oddCells(n, m, indices);

        System.out.println(res);
    }

    public static int oddCells(int n, int m, int[][] indices) {
        int[][] cells = new int[n][m];

        for(int[] c : indices) {
            for(int i = 0; i < n; i++) {
                cells[i][c[1]] += 1;
            }

            for(int i = 0; i < m; i++) {
                cells[c[0]][i] += 1;
            }
        }

        System.out.println(Arrays.deepToString(cells));

        int count = 0;

        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                if(cells[i][j] %2 != 0) count++;

        return count;
    }
}

