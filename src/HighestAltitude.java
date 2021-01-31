import java.util.Scanner;

public class HighestAltitude {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = largestAltitude(arr);

        System.out.println(res);
    }

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;

        for(int i : gain) {
            sum += i;
            if (max < sum) max = sum;
        }

        return max;
    }
}
