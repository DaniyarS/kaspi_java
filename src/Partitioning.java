import java.util.Scanner;

public class Partitioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int res = minPartitions(s);

        System.out.println(res);
    }

    public static int minPartitions(String n) {
        if(n.length() == 1) {
            char[] arr = n.toCharArray();
            return arr[0];
        }

        int max = 0;
        for(char c : n.toCharArray()) {
            if (max < Character.getNumericValue(c)) {
                max = Character.getNumericValue(c);
            }
        }
        return max;
    }
}
