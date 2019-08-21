package hackerRangTasks.bigNumber;

import java.util.Scanner;

/**
 * Created by Islombek Karimov on 09.08.2018.
 */
public class BigDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        String[] str = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].equals(s[j])) {
                    String temp = s[i];
                }
            }
        }


        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.println("s== " + s[i]);
        }
    }
}
