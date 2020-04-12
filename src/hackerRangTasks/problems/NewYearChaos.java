package hackerRangTasks.problems;

import java.util.Scanner;

/**
 * Created by Islombek Karimov on 21.02.2020.
 */
public class NewYearChaos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 1; j <= t; j++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            minimumBribes(arr);
        }
    }

    static void minimumBribes(int[] massiv) {
        int cnt = 0;
        boolean chaotic = false;
        for (int i = massiv.length - 1; i >= 0; i--) {
            if (massiv[i] - (i + 1) > 2) {
                chaotic = true;
                break;
            }
            for (int j = Math.max(0, massiv[i] - 2); j < i; j++)
                if (massiv[i] < massiv[j])
                    cnt++;


        }
        System.out.println(chaotic ? "Too chaotic" : cnt);
    }


    static int count(int[] massiv) {
        int cnt = 0;
        for (int i = 0; i <= massiv.length - 1; i++) {
            for (int j = 0; j <= massiv.length - 1; j++) {
                if (massiv[i] > massiv[j]) {
                    cnt++;
                }
            }
            break;
        }
        return cnt;
    }

    static String tooChaotic(int mas[]) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= mas.length - 1; i++) {
            if (mas[i] - mas[i + 1] > 2) {
                sb.append("Too chaotic");
            }
            break;
        }
        return sb.toString();
    }


}


