import java.util.Scanner;

public class MaxPairsOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        long result = MaxPair(nums);
        System.out.println(result);
    }

    private static long MaxPair(int[] nums) {
        int n_Size = nums.length;
        int max_index1 = -1;
        for (int p = 0; p < n_Size; p++) {
            if ((max_index1 == -1) || (nums[p] > nums[max_index1]))
                max_index1 = p;
        }
        int max_index2 = -1;
        for (int k = 0; k < n_Size; k++) {
            if ((k != max_index1) && ((max_index2 == -1) || (nums[k] > nums[max_index2])))
                max_index2 = k;
        }
        return (long)nums[max_index1] * nums[max_index2];
    }
}

