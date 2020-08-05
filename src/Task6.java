import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task6 {
    //Поиск ближайшего двоякого числа
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result;

        if (checkNumber(number)) {
            result = number;
        } else {
            int stepBack = 0, stepForward = 0, decreaseInt = 0, increaseInt = 0;

            for (int i = number; i > 0; i--) {
                if (checkNumber(i)) {
                    decreaseInt = i;
                    break;
                }
                stepBack++;
            }

            for (int i = number; i <= 30000; i++) {
                if (checkNumber(i)) {
                    increaseInt = i;
                    break;
                }
                stepForward++;
            }

            //сравниваем который из соседних двояких чисел находится ближе
            if (stepBack > stepForward) {
                result = increaseInt;
            } else {
                result = decreaseInt;
            }
        }

        System.out.println(result);
    }

    public static boolean checkNumber(int number) {
        Set<Integer> set = new HashSet<>(); //храним уникальные числа в сете

        while (number > 0) {
            int digit = number % 10;
            set.add(digit);
            number /= 10;
        }

        return set.size() < 3; //Возвращаем true если кол-во уникальных чисел не больше 2
    }
}
