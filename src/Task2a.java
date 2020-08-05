import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2a {

    //2 Задача поиск подстрок в строке
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        //создаем паттерн, для регулярных выражении(regex)
        String pat = "(?=(>>-->)|(<--<<))";
        Pattern pattern = Pattern.compile(pat);

        int count = countOccurrence(pattern, input);

        System.out.println(count);
    }

    public static int countOccurrence(Pattern pattern, String input) {
        int count = 0;

        //Если сабстринги входящего стринга совпадают с паттерном то прибавляем к count +1
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
