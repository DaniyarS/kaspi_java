import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MorseCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String[] words = new String[size];
        for (int i = 0; i < size; i++) words[i] = sc.next();

        int res = uniqueMorseRepresentations(words);

        System.out.println(res);
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                        "....", "..", ".---", "-.-", ".-..", "--", "-.",
                        "---", ".--.", "--.-", ".-.", "...", "-",
                        "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> morseConverted = new HashSet<>();

        for (String s : words) {
            StringBuilder word = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                word.append(morse[s.charAt(j) - 97]);
            }
            morseConverted.add(word.toString());
        }

        return morseConverted.size();
    }


}
