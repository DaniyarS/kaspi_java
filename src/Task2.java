import java.util.Scanner;
import java.util.regex.Matcher;

public class Task2 {

    //2 Задача поиск подстрок в строке
//    public static final int hashIndex = 3; //3, потому что в нашем стринге только 3 типа символа
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String sequence = scanner.next();
//        int result = countSubString(sequence);
//
//        System.out.println(result);
//    }
//
//    static int countSubString(String sequence) {
//        int size = sequence.length();
//        int result = 0;
//
//        String str1 = ">>-->";
//        String str2 = "<--<<";

//        int str1Hash = getHashCode(str1);
//        int str2Hash = getHashCode(str2);

//        int start = 0;
//        int end = 5;
//        int i;
//
//        while (end <= size) {
//            String pattern = sequence.substring(start, end);

//            //Проверяем равны ли хэшкоды паттернов и подстрок
//            if (getHashCode(pattern) == str1Hash || getHashCode(pattern) == str2Hash) {
//                //Если хэшкоды равны, то проверяем по буквам
//                for (i = 0; i < pattern.length(); i++) {
//                    if (pattern.charAt(i) != str1.charAt(i) || pattern.charAt(i) != str2.charAt(i) ) {
//                        break;
//                    }
//                }
//
//                if (i == pattern.length()) {
//                    result++;
//                }
//            }

            //for (i = 0; i < sequence.length(); i++) {
//                if (pattern.equals(str1) || pattern.equals(str2)) {
//                    result++;
//                }
            //}

//            start++;//сдвигаем окно по задданной строке
//            end++;
//        }
//
//        return result;
//    }

//    static int getHashCode(String pattern) {
//        int hashCode = 0;
//        int i = 0;
//        int n = pattern.length()-1;
//
//        //получаем уникальный хэшкод подстроки
//        while (n >= i) {
//            for (int j = 0; j < pattern.length(); j++) {
//                hashCode += (pattern.charAt(j) * Math.pow(hashIndex, n));
//            }
//            n--;
//        }
//
//        return hashCode;
//    }
}
