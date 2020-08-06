import java.util.Scanner;

public class Task7 {

    static int[] array = new int[100];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        decompose(m, m, 0);
    }

    //number - здесь хранится само число
    //remain - здесь мы храним слоги
    //unitIndex - здесь мы храним индекс остатка от слога

    public static void decompose(int number, int remain, int unitIndex) {

        //Если зад-ное число равен нулю, то мы можем выводить в консоль слоги этого же числа
        if (number == 0) {
            for (int i = 0; i < unitIndex; i++) {
                if (i > 0) {
                    System.out.print(array[i] + " + ");
                } else {
                    System.out.print(array[i]);
                }
            }
            System.out.println();
        }
        else {
            if (number >= remain) {
                array[unitIndex] = remain;
                decompose(number - remain, remain, unitIndex + 1);
            }
            if (remain > 1) {
                decompose(number, remain-1, unitIndex);
            }
        }
    }
}
