import java.util.Arrays;
import java.util.Scanner;

public class TheBiggestDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int diff = maxProductDifference(array);
        System.out.println(diff);
    }

    static public int maxProductDifference(int[] nums) {
        int temp, size;
        size = nums.length;

        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return (nums[size-1] * nums[size-2]) - (nums[1] * nums[0]);
    }
}
