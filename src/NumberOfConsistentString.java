import java.util.Scanner;
import java.util.Set;

public class NumberOfConsistentString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String allowed = sc.next();

        int size = sc.nextInt();
        String[] words = new String[size];

        for (int i = 0; i < size; i++) {
            words[i] = sc.next();
        }

        int result = countConsistentStrings(allowed, words);

        System.out.println(result);
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int result = 0;

        for (String word : words) {
            boolean isAllowed = false;
            for (int j = 0; j < allowed.length(); j++) {
                for (int y = 0; y < word.length(); y++) {
                    if (allowed.charAt(j) == word.charAt(y)) {
                        isAllowed = true;
                    }
                }
            }

            if (isAllowed) {
                result++;
            }
        }

        return result;
    }
}
