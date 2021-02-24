import java.util.Scanner;
import java.util.Stack;

public class MaxDepth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int res = maxDepth(input);

        System.out.println(res);
    }

    public static int maxDepth(String s) {
        int cnt = 0;
        int max = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') cnt++;
            else if (c == ')') cnt--;
            max = Math.max(cnt, max);
        }

        return max;
    }

}
