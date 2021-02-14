import java.util.Scanner;

public class NegativeCnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] inArray = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                inArray[i][j] = sc.nextInt();

        int res = countNegatives(inArray);

        System.out.println(res);
    }

    public static int countNegatives(int[][] grid) {
        int globalCnt = 0;

        for (int[] ints : grid) {
            int cnt = 0;
            int j = ints.length - 1;
            while (cnt != ints.length && 0 > ints[j]) {
                cnt++;
                j--;
            }
            //System.out.println(cnt);
            globalCnt += cnt;
        }

        return globalCnt;
    }
}
