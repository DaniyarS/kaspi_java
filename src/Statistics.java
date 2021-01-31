import java.util.ArrayList;
import java.util.Scanner;

public class Statistics {
    //acmp, 5

    private String name = "dw";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] initArray = new int[n];

        for (int i = 0; i < n; i++) {
            initArray[i] = scanner.nextInt();
        }

        int[] oddNumbers = new int[n];
        int[] evenNumbers = new int[n];

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (initArray[j] % 2 == 0) {
                    evenNumbers[i] = initArray[j];
                } else if (initArray[j] % 2 != 0) {
                    oddNumbers[i] = initArray[j];
                }
            }
        }

        for (int oddNumber : oddNumbers) {
            System.out.print(oddNumber + " ");
        }

        System.out.println();

        for (int evenNumber : evenNumbers) {
            System.out.print(evenNumber + " ");
        }

        System.out.println();

        if (evenNumbers.length < oddNumbers.length) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
