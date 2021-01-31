import java.util.Scanner;

public class VisitAllPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int res = minTimeToVisitAllPoints(arr);

        System.out.println(res);
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;

        for(int i = 0; i < points.length - 1; i++) {
            int a = Math.abs(Math.abs(points[i+1][0]) - Math.abs(points[i][0]));
            int b = Math.abs(Math.abs(points[i+1][1]) - Math.abs(points[i][1]));
            time += Math.max(a, b);
        }

        return time;
    }
}
