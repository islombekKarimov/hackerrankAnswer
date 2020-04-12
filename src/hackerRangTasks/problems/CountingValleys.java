package hackerRangTasks.problems;

import java.util.Scanner;

/**
 * Created by Islombek Karimov on 16.02.2020.
 */
public class CountingValleys {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "DDUUDDUDUUUD";
        System.out.println(countingValleys(n, s));

    }


    static int countingValleys(int n, String s) {
        String[] str = s.split("");
        int count = 0;
        int countValley = 0;
        for (int i = 0; i < n; i++) {
            if (str[i].equals("U")) {
                count++;
            } else {
                if (count == 0) {
                    countValley++;
                }
                count--;
            }
        }
        return countValley;
    }
}
