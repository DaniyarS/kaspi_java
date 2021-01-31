import java.util.Scanner;

public class ShuffleTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int[] indices = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            indices[i] = sc.nextInt();
        }

        String result = restoreString(input, indices);
        System.out.println(result);
    }

    public static String restoreString(String s, int[] indices) {
        char[] restored = new char[s.length()];

        for (int i = 0; i < indices.length; i++) {
            char c = s.charAt(i);
            restored[indices[i]] = c;
        }

        return new String(restored);
    }
}
