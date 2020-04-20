package hackerRangTasks.problems;

import java.util.Arrays;
import java.util.stream.LongStream;

/**
 * Created by Islombek Karimov on 12.04.2020.
 */
public class AVeryBigSum {


    public static void main(String[] args) {
        long[] arr = new long[]{1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        System.out.println("sum " + aVeryBigSum(arr));

    }

    static long aVeryBigSum(long[] ar) {
        LongStream longStream = Arrays.stream(ar);
        long sum = longStream.reduce(0, (temValue, value) -> temValue + value);
        return sum;
    }
}