import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelfDivide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int left = sc.nextInt();
        int right = sc.nextInt();

        List res = selfDividingNumbers(left, right);

        System.out.println(res);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nums = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int factor = left % 10;
            boolean isSelfDiv = true;
            int cur = left;

            while (left % factor == 0) {

                if (left % factor != 0) {
                    isSelfDiv = false;
                    break;
                }

                cur = cur / 10;
                factor = cur % 10;
            }

            if (isSelfDiv) nums.add(left);
        }

        return nums;
    }
}
