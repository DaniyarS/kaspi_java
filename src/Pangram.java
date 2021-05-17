import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        System.out.println(checkIfPangram(input));
    }

    public static boolean checkIfPangram(String sentence) {
        if (sentence == null || sentence.length() < 26)
            return false;

        Set<Character> ch = new HashSet<>();

        for (char chr : sentence.toCharArray()) {
            ch.add(chr);
            if (ch.size() == 26) return true;
        }

        return false;
    }
}
