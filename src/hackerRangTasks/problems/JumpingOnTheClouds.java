package hackerRangTasks.problems;

import java.util.Scanner;

/**
 * Created by Islombek Karimov on 16.02.2020.
 */
public class JumpingOnTheClouds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {0, 0, 1, 0, 0, 1, 0};
        int cnt = -1;
        for (int i = 0; i < arr.length; i++, cnt++) {
            if (i < (arr.length - 2) && arr[i + 2] == 0) {
                i++;
            }
        }
        System.out.println("cnt " + cnt);
    }
}
