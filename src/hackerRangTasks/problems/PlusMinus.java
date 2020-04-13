package hackerRangTasks.problems;

/**
 * Created by acer i5 on 13.04.2020.
 */
public class PlusMinus {
    public static void main(String[] args) {
        int[] arr = new int[]{-4, 3, -9, 0, 4, 1};
        plusMinus(arr);
    }

    static void plusMinus(int[] arr) {
        double positive = 0;
        double negative = 0;
        double zero = 0;
        int arrSize = arr.length;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > 0) {
                positive++;
            }
            if (arr[i] < 0) {
                negative++;
            } else if (arr[i] == 0) {
                zero++;
            }
        }
        System.out.println(positive / arrSize);
        System.out.println(negative / arrSize);
        System.out.println(zero / arrSize);

    }


}
