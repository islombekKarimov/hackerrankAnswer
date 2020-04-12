package hackerRangTasks.problems;

import java.util.Scanner;

/**
 * Created by Islombek Karimov on 24.02.2020.
 */
public class LeftRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int[] mass = new int[n];
        int cnt = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i < d){
                mass[arr.length-d+i]= arr[i];
            }
            else {
                mass[cnt++] = arr[i];
            }

        }

        for (int i = 0; i <= mass.length - 1; i++) {
            System.out.print(" " + mass[i]);
        }

    }
}
