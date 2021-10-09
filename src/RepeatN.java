import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class RepeatN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[2*n];

        for (int i = 0; i < n * 2; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = repeatedNTimes(arr);

        System.out.println(ans);
    }

    public static int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) cnt++;
                if (cnt == n) {
                    return nums[j];
                }
            }
            cnt = 0;
        }

        return -1;
    }
}
