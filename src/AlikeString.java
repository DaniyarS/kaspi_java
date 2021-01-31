import java.util.Scanner;

public class AlikeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        boolean res = halvesAreAlike(word);

        System.out.println(res);
    }

    public static boolean halvesAreAlike(String s) {
        int cnt1 = 0;
        int cnt2 = 0;

        String firstHalf = s.substring(0, s.length()/2);
        String secondHalf = s.substring(s.length()/2);

        String vowels = "aeiouAEIOU";

        for (char c : firstHalf.toCharArray()) if (vowels.indexOf(c) != -1) cnt1++;
        for (char c : secondHalf.toCharArray()) if (vowels.indexOf(c) != -1) cnt2++;

        return cnt1==cnt2;
    }
}
