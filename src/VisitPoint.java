import java.util.Scanner;

public class VisitPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[][] points = new int[size][2];

        int pointsQ = minTimeToVisitAllPoints(points);

        System.out.println(pointsQ);
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 0; i < points.length; i++) {
            time++;
            for (int j = 0; j < 2; j++) {
                time += points[i+1][j+1] - (points[i][j] + 1);
            }
        }

        return time;
    }
}
