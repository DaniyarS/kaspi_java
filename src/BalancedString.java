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
        Stack<Character> stack = new Stack<>();
        int countL = 0;
        int countR = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R' || s.charAt(i) == 'L') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    //return result;
                } else {
                    char popVal = stack.pop();
                    if (s.charAt(i) == 'R' && popVal == 'L') {
                        result++;
                    } else if (s.charAt(i) == 'L' && popVal == 'R') {
                        result++;
                    }
                }
            }
        }

        return result;
    }
}
