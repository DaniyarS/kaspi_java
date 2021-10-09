import java.util.Arrays;
import java.util.Scanner;

public class MinOper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int stepRes = minOperations(arr);

        System.out.println(stepRes);
    }

    public static int minOperations(int[] nums) {
        int step = 0;

        for (int i = 1; i < nums.length; i++) {
            step += increaseIf(i, nums);
        }

        return step;
    }

    private static int increaseIf(int curr, int[] nums) {
        int s = 0;

        while(nums[curr-1] + 1 > nums[curr]) {
            nums[curr] = nums[curr] + 1;
            s++;
        }

        return s;
    }
}
