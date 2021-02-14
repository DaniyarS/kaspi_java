import java.util.Scanner;

public class NumberOfRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[][] rects = new int[size][2];

        for (int i = 0; i < size; i++)
            for (int j = 0; j < 2; j++)
                rects[i][j] = sc.nextInt();

        int res = countGoodRectangles(rects);

        System.out.println(res);
    }

    public static int countGoodRectangles(int[][] rectangles) {
        int max1;
        int max2;
        int totalMax = (int) 1e9;

        for (int i = 0; i < rectangles.length - 1; i++) {
            max1 = Math.min(rectangles[i][0], rectangles[i][1]);
            max2 = Math.min(rectangles[i+1][0], rectangles[i+1][1]);
            totalMax = totalMax > Math.min(max1, max2) ? Math.min(max1, max2) : totalMax;
        }

        return totalMax;
    }
}
