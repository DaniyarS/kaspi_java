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

            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    int k = 0;
                    for (int j = k; j < i; j++) {
                        sum += arr[j];
                        k++;
                        while (i < arr.length) {
                            i++;
                        }
                    }
                }
            }

            return sum;
        }
    }
}
