import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Truncate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int index = scanner.nextInt();

        String result = truncateSentence(input, index);

        System.out.println(result);
    }

    public static String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for(char c : s.toCharArray()) {
            if (c == ' ') {
                index++;
            }

            if (index != k) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
