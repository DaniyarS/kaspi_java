import java.util.Scanner;

public class Task4 {
    //Сумма положительных чисел и произведение чисел, находящихся между ними

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sumOfNumbers = 0, multOfNumbers = 1;
        int min = 100100, max = -100100;
        int start = -1, end = -1;

        for (int i = 0; i < n; i++) {
            //если число больше нуля
            if (array[i] > 0) {
                sumOfNumbers += array[i];
            }

            //ищем минимальное число
            if (min > array[i]) {
                min = array[i];
                start = i;
            }

            //ищем максимальное число
            if (max < array[i]) {
                max = array[i];
                end = i;
            }
        }

        for (int i = 0; i < n; i++) {

            //если числа находятся между минимальным и максимальным числом
            if (start > i && i > end) {
                multOfNumbers *= array[i];
            } else if (start < i && i < end) {
                multOfNumbers *= array[i];
            }
        }

        System.out.println(sumOfNumbers +" "+ multOfNumbers);
    }
}
