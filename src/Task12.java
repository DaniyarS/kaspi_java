import java.util.Scanner;

public class Task12 {
    //День рождения количество расстоновок всех гостей
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guests = scanner.nextInt();
        int fact = 1;

        for (int i = 1; i <= guests; i++) {
            fact *= i;
        }

        long result = Math.round(fact/Math.E);

        System.out.println(result);
    }
}
