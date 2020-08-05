import java.util.Scanner;

public class Task1 {

//Task1 longest sequence of 0s

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String numberSequence = scanner.next();

        int result = countZeroes(numberSequence);

        System.out.println(result);

    }

    static int countZeroes(String numberSequence) {

        int result = 0;

        //checking string is empty or not
        if (!numberSequence.isEmpty()) {

            for (int i = 0; i < numberSequence.length()-1; i++) {
                int nCurrentSubstring = 0;

                //check if next char is '0'
                while (i < numberSequence.length() && numberSequence.charAt(i) == '0') {
                    nCurrentSubstring++;
                    i++;
                }

                //binding the longest sequence to result variable
                result = Math.max(nCurrentSubstring, result);
            }
        }

        return result;
    }
}
