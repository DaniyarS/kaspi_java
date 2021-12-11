import java.awt.*;
import java.util.Scanner;

public class AnnoDomini {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String input1 = sc.next();
        String input2 = sc.next();
        String input3 = sc.next();
        String input4 = sc.next();

        int fistYear;
        int secondYear;
        int res;
        boolean firstIsBc = false;

        if(input1.equals("AD")) {
            fistYear = Integer.parseInt(input2);

        } else {
            firstIsBc = true;
            fistYear = Integer.parseInt(input1);
        }

        if(input3.equals("AD")) {
            secondYear = Integer.parseInt(input4);
            if (!firstIsBc) {
                res = Math.abs(secondYear - fistYear);
            } else {
                res = Math.abs(secondYear + fistYear) - 1;
            }
        } else {
            secondYear = Integer.parseInt(input3);

            if (!firstIsBc) {
                res = Math.abs(secondYear + fistYear) - 1;
            } else {
                res = Math.abs(secondYear - fistYear);
            }
        }

        System.out.println(res);
    }
}
