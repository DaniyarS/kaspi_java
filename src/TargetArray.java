import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TargetArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];
        int[] indices = new int[size];

        int[] output = createTargetArray(nums, indices);

        System.out.println(output);
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            target[i] = targetList.get(i);
        }

        return target;
    }
}
