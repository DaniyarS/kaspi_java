import java.util.Scanner;

public class Task3 {
    //Минимальная длина возможной строки
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sequence = sc.next();

        int[] prefix = prefixFunction(sequence);
        int result = sequence.length() - prefix[prefix.length - 1];

        System.out.println(result);
    }

    //
    public static int[] prefixFunction(String str) {
        int size = str.length();
        int[] prefix = new int[size];

        for (int i = 1; i < size; i++) {
            int j = prefix[i - 1];
            while (j > 0 && str.charAt(i) != str.charAt(j)) {
                j = prefix[j - 1];
            }
            if (str.charAt(i) == str.charAt(j)) {
                j++;
            }
            prefix[i] = j;
        }

        return prefix;
    }
}
