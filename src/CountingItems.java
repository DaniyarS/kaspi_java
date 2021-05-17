import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountingItems {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int iSize = sc.nextInt();
        String ruleKey = sc.next();
        String ruleValue = sc.next();

        List<List<String>> items = new ArrayList<>();
        
        for (int i = 0; i < iSize; i++) {
            List<String> item = new ArrayList<>(3);
            for (int j = 0; j < 3; j++) {
                item.add(sc.next());
            }
            items.add(item);
        }

        int result = countMatches(items, ruleKey, ruleValue);

        System.out.println(result);
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;

        int idx = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> -1;
        };

        for (List<String> item : items) {
            res += item.get(idx).equals(ruleValue) ? 1 : 0;
        }

        return res;
    }

}
