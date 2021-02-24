import java.util.Scanner;

public class SumOfUnique {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }

            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                sum += nums[i];
            }
        }

        return sum;
    }
}
