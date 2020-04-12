package hackerRangTasks.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Islombek Karimov on 18.02.2020.
 */
public class SockMerchant {
    public static void main(String[] args) {
        int n = 9;
        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int cnt = 0;
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (integerSet.contains(arr[i])) {
                cnt++;
                integerSet.remove(arr[i]);
            } else {
                integerSet.add(arr[i]);
            }
        }
        System.out.println("cnt = " + cnt);
    }

}
