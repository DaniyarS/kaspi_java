import java.util.Scanner;

public class ReduceNumberToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int output = numberOfSteps(num);

        System.out.println(output);
    }

    public static int numberOfSteps (int num) {

        int step = 0;
        if (num == 0) {
            return 0;
        } else {
            while (num > 0) {
                if (num%2 == 0) {
                    num /= 2;
                } else {
                    num--;
                }
                step++;
                System.out.println(num);
            }
        }

        return step;
    }
}
