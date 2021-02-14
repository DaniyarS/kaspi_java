import java.util.Scanner;

public class NumberInTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] sTime = new int[size];
        int[] eTime = new int[size];

        for (int i = 0; i < size; i++)
            sTime[i] = sc.nextInt();

        for (int i = 0; i < size; i++)
            eTime[i] = sc.nextInt();

        int qTime = sc.nextInt();

        int res = busyStudent(sTime, eTime, qTime);

        System.out.println(res);
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int cnt = 0;

        for (int i = 0; i < startTime.length; i++)
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) cnt++;

        return cnt;
    }
}
