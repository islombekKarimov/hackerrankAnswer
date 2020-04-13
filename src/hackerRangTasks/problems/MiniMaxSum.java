package hackerRangTasks.problems;

import java.util.Arrays;

/**
 * Created by acer i5 on 13.04.2020.
 */
public class MiniMaxSum {
    public static void main(String[] args) {
        int[] arr = new int[]{256741038, 623958417, 467905213, 714532089, 938071625};
        miniMaxSum(arr);
    }

    static void miniMaxSum(int[] arr) {
        long sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }
        long max = sum - arr[0];
        long min = sum - arr[arr.length - 1];
        System.out.println(min + " " + max);
    }
}
