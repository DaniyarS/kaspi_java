import java.util.Scanner;

public class Task5 {

    //Волосатый бизнес

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0, maxPrice = -100;
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        //берем массив с конца, определяем максимум после каждой итерации.
        //Если число больше предыдущего продаем волосы по новой цене, если
        //нет то по старой
        for (int i = prices.length - 1; i >= 0; i--) {
            maxPrice = Math.max(prices[i], maxPrice);
            result += maxPrice;
        }

        System.out.println(result);
    }
}
