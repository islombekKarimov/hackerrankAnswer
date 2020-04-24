package hackerRangTasks.problems;

import java.util.Arrays;

/**
 * Created by Islombek Karimov on 24.04.2020.
 */
public class BirthdayCakeCandles {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 3};
        System.out.println(birthdayCakeCandles(arr));
    }

    static int birthdayCakeCandles(int[] ar) {
        int candlesNum = 0;
        Arrays.sort(ar);
        int max = ar[ar.length - 1];
        for (int i = 0; i <= ar.length - 1; i++) {
            if (max == ar[i]) {
                candlesNum++;
            }
        }
        return candlesNum;
    }


}
