package hackerRangTasks.string;

import java.util.Scanner;

/**
 * Created by acer i5 on 08.06.2018.
 */
public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String d = "[ .,?!_'@]+";
        String[] arr = s.split(d);
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (!arr[i].isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i <= arr.length - 1; i++) {
            if (!arr[i].isEmpty()) {
                System.out.println(arr[i]);
            }
        }

    }
}
