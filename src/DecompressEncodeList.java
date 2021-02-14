import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DecompressEncodeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) nums[i] = sc.nextInt();

        int[] res = decompressRLElist(nums);

        System.out.println(Arrays.toString(res));
    }

    public static int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i+=2) size += nums[i];

        int[] res = new int[size];

        for (int i = 0, index = 0; i < nums.length; i++) {
            int freq = nums[i++];
            int val = nums[i];
            for (int j = 0; j < freq; j++) res[index++] = val;
        }

        return res;
    }
}
