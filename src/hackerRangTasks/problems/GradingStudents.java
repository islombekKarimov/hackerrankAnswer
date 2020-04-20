package hackerRangTasks.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

/**
 * Created by Islombek Karimov on 20.04.2020.
 */
public class GradingStudents {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(73,67,38,33);
        System.out.println(gradingStudents(integerList).toString());
    }


    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i <= grades.size() - 1; i++) {
            if (grades.get(i) % 5 > 2 && !(grades.get(i) < 38)) {
                integerList.add(grades.get(i) + (5 - grades.get(i) % 5));
            } else {
                integerList.add(grades.get(i));
            }
        }
        return integerList;
    }
}
