import java.util.Scanner;
import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        int result = balancedStringSplit(input);

        System.out.println(result);
    }

    public static int balancedStringSplit(String s) {
        int result = 0;
        int ans = 0;
        char[] c = s.toCharArray();

        for (int i = c.length-1; i >= 0; i--) {
            if(c[i] == 'L') {
                result++;
            } else if (c[i] == 'R'){
                result--;
            }
            if(result == 0) {
                ans++;
            }
        }

        return ans;
    }
}
