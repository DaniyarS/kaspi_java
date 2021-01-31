import java.util.Scanner;

public class DefangingIp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();

        String result = defangIPaddr(ip);
        System.out.println(result);
    }

    private static String defangIPaddr(String address) {

        address = address.replace(".", "[.]");

        return address;
    }
}
