import java.util.Scanner;

public class Task11 {
    //Анаграммер

    //НЕ РЕШЕНА

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String original = scanner.next();
//        String copy = scanner.next();
//        int n = original.length();
//        int[][][] count = new int[1+n][1+n][1+n];
//
//        for (int length = 0; length <= n; length++) {
//            for (int firstWord = 0; firstWord + length <=n; firstWord++) {
//                for (int secondWord = 0; secondWord <= firstWord; secondWord++) {
//                    if (length == 0) {
//                        count[length][firstWord][secondWord] = 0;
//                    } else if (length == 1) {
//                        if (original.charAt(firstWord) == copy.charAt(secondWord)) {
//                            count[length][firstWord][secondWord] = 1;
//                        } else {
//                            count[length][firstWord][secondWord] = 0;
//                        }
//                    } else {
//                        int sum = 0;
//                        for (int add = 0; add < length; add++) {
//                            if (original.charAt(firstWord) == copy.charAt(firstWord + add)) {
//                                sum += count[add][firstWord+1]
//                                        [secondWord] * count[length - 1 - add][firstWord + 1 + add]
//                                        [secondWord + 1 + add];
//                            }
//                        }
//
//                        count[length][firstWord][secondWord] = sum;
//                    }
//                }
//            }
//        }
//        System.out.println(count[n][0][0]);
//    }
}
