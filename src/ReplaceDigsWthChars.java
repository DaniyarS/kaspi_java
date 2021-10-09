import java.util.Scanner;

public class ReplaceDigsWthChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();

        String res = replaceDigits(inp);

        System.out.println(res);
    }

    public static String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < s.length(); i+=2) {
            sb.append(s.charAt(i-1));
            sb.append((char) (Integer.parseInt(String.valueOf(s.charAt(i))) + s.charAt(i-1)));
        }

        sb.append(s.charAt(s.length()-1));

        return new String(sb);
    }
}
