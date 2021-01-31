import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(shuffle(numbers, n)));
    }

    public static int[] shuffle(int[] numbers, int n) {

        int[] result = new int[2 * n];

        int i = 0;
        int j = 1;
        for (int z = 0; z < n; z++) {
            result[i] = numbers[z];
            i += 2;
        }
        for (int y = n; y < 2*n; y++) {
            result[j] = numbers[y];
            j += 2;
        }

        return result;
    }
}
