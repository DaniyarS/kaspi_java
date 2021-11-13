import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = 0, n = 0;

        m = scanner.nextInt();
        n = scanner.nextInt();

        System.out.println("m => " + m + " n => " + n);

        int[] nums1 = new int[m];
        int[] nums2 = new int[n];

        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int arrLength = m + n;
        int i = 0;
        int j = 0;
        int k = 0;

        int[] resArr = new int[arrLength];

        while (i < nums1.length || j < nums2.length || k < resArr.length) {
            System.out.println("попали в блок while");
            System.out.println("i => " + i + " j=> " + j);

            if(nums1[i] > nums2[j]) {
                resArr[k] = nums2[j];
                j++;
            } else {
                resArr[k] = nums1[i];
                i++;
            }

            k++;

            System.out.println(Arrays.toString(resArr));
        }

        System.out.println(Arrays.toString(resArr));
    }
}
