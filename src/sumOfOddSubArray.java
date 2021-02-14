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
            int i = 1;
            int k = 0;
            if (arr.length % 2 == 0) {
                while (i < arr.length) {
                    for (int j = k; j < i; j++) {
                        sum += arr[j];
                    }
                    k++;
                    i += 2;
                }
            } else {
                while (i <= arr.length) {
                    for (int j = k; j < i; j++) {
                        sum += arr[j];
                    }
                    k++;
                    i += 2;
                }
            }

            return sum;
        }
    }
}
