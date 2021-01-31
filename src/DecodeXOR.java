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
        int[] output = new int[encoded.length];

        for (int i = 0; i < encoded.length; i++) {
            if (i == 0) {
                output[i] = first;
            } else if (i == 1){
                if (first%2 == 0) {
                    output[i] = encoded[i] + first;
                } else {
                    output[i] = encoded[i] - first;
                }
            } else {
                if (encoded[i-1]%2 == 0) {
                    output[i] = encoded[i-1] - encoded[i];
                }

            }
        }

        return output;
    }
}
