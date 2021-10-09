import java.util.Scanner;

public class XOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int res = subsetXORSum(array);
        System.out.println("Res-> " + res);
    }

    public static int subsetXORSum(int[] nums) {
        if(nums.length == 0) return 0;

        int sum = 0;
        int sum2 = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum2 ^= nums[i];
            for(int j = i+1; j < nums.length; j++) {
                int add = nums[i] ^ nums[j];
                sum += add;
            }
        }

        return sum + sum2;
    }
}
