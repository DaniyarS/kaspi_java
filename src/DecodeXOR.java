import java.util.Arrays;
import java.util.Scanner;

public class DecodeXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int first = sc.nextInt();

        int[] encoded = new int[size];

        for (int i = 0; i < size; i++) {
            encoded[i] = sc.nextInt();
        }

        int[] output = decode(encoded, first);

        System.out.println(Arrays.toString(Arrays.stream(output).toArray()));
    }

    public static int[] decode(int[] encoded, int first) {
        int decodedSize = encoded.length + 1;

        int[] output = new int[decodedSize];

        output[0] = first;

        for (int i = 1; i < decodedSize; i++) {
            output[i] = encoded[i-1] ^ encoded[i];
        }

        return output;
    }
}
