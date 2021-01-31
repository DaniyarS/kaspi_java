import java.util.Scanner;

public class SixNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int res = maximum69Number(num);

        System.out.println(res);
    }

    public static int maximum69Number (int num) {
        int initialNumber = num;
        int i = 0;
        int firstSixPos = -1;

        while(num / 10 != 0) {
            if(num % 10 == 6) {
                firstSixPos = i;
            }
            num /= 10;
            i++;
        }

        if (initialNumber / (int)Math.pow(10, i) == 9 && firstSixPos == -1)
            return num;
        else if (initialNumber / (int)Math.pow(10, i) == 6)
            return initialNumber + 3*((int)Math.pow(10, i));

        return initialNumber + 3*((int)Math.pow(10, firstSixPos));
    }
}
