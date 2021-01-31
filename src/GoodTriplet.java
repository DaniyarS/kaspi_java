import java.util.Scanner;

import static java.lang.Math.abs;

public class GoodTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int result = countGoodTriplets(arr, a, b, c);

        System.out.println(result);
    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int output = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a &&
                            Math.abs(arr[j] - arr[k]) <= b &&
                            Math.abs(arr[i] - arr[k]) <= c) {
                        output++;
                    }
                }
            }
        }

        return output;
    }
}
