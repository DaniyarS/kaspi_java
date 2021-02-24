import java.util.Scanner;

public class sumOfOddSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = sumOddLengthSubarrays(arr);

        System.out.println(res);
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        } else {
            int sum = 0;

            for (int i = 1; i < arr.length - 1; i++) {
                if (i%2 != 0) {
                    for (int j = 0; j < j + i; j++) {
                        sum += arr[j];
                    }
                }
            }

            return sum;
        }
    }
}
