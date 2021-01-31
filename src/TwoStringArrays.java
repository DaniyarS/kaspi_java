import java.util.Scanner;

public class TwoStringArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sizeW1 = sc.nextInt();
        int sizeW2 = sc.nextInt();

        String[] word1 = new String[sizeW1];
        String[] word2 = new String[sizeW2];

        for (int i = 0; i < sizeW1; i++) {
            word1[i] = sc.next();
        }

        for (int i = 0; i < sizeW2; i++) {
            word2[i] = sc.next();
        }

        boolean answer = arrayStringsAreEqual(word1, word2);

        System.out.println(answer);
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sbW1 = new StringBuilder();
        StringBuilder sbW2 = new StringBuilder();

        for (String s : word1) {
            sbW1.append(s);
        }

        String wordOne = new String(sbW1);

        for (String s : word2) {
            sbW2.append(s);
        }

        String wordTwo = new String(sbW2);

        return wordOne.equals(wordTwo);
    }
}
