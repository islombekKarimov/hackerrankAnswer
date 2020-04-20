package hackerRangTasks.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Islombek Karimov on 12.04.2020.
 */
public class CompareTriplets {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(17, 28, 30);
        List<Integer> b = Arrays.asList(99, 16, 8);
        List<Integer> list = compareTriplets(a, b);
        list.forEach(System.out::println);
    }


    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> integerList = new ArrayList<>();
        int[] arr = new int[]{0, 0};
        for (int i = 0; i <= a.size() - 1; i++) {
            if (a.get(i) > b.get(i)) {
                arr[0]++;
            } else if (a.get(i) < b.get(i)) {
                arr[1]++;
            }
        }

        integerList.add(arr[0]);
        integerList.add(arr[1]);
        return integerList;
    }
}



