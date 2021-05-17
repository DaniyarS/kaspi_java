import java.util.Scanner;

public class BrokenTelephone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        if(in >= 1 && in <= 100)
            System.out.println(in);
    }
}
