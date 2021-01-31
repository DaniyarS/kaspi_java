import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestNumberOfCandy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nKids = scanner.nextInt();
        int extraCandy = scanner.nextInt();
        int[] kids = new int[nKids];

        for (int i = 0; i < nKids; i++) {
            kids[i] = scanner.nextInt();
        }

        List<Boolean> result = kidsWithCandies(kids, extraCandy);
        
        System.out.println(result);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        List<Boolean> result = new ArrayList<>(candies.length);

        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(true);
            } else result.add(false);
        }

        return result;
    }
}
