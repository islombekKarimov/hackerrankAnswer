package hackerRangTasks.string;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Islombek Karimov.
 */
public class SubstringComparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmollestAndLargest(s,k));

    }

    public static String getSmollestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        SortedSet<String> sort = new TreeSet<>();
        if (k == s.length()) {
            System.out.println(s);
            return s;
        } else {
            for (int i = 0; i <= s.length() - k; i++) {
                sort.add(s.substring(i, i + k));
                sort.add(s.substring(s.length() - k, s.length()));
            }
            smallest = sort.first();
            largest = sort.last();

            return smallest + "\n" + largest;
        }
    }
}
