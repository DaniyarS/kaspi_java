import java.util.Arrays;
import java.util.Scanner;

public class SortColours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sortColors(arr);
    }

    public static void sortColors(int[] nums) {
        int pointer = 0;

        for (int i = 0; i < 3; i++)
            for (int j = pointer; j < nums.length; j++) {
                if(nums[j] == i) {
                    nums[j] = nums[pointer];
                    nums[pointer++] = i;
                }
            }

    }

}
