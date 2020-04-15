package hackerRangTasks.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by acer i5 on 15.04.2020.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        ArrayList<List<Integer>> integerList = new ArrayList<List<Integer>>(3);
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(11);
        firstLine.add(2);
        firstLine.add(4);
        integerList.add(firstLine);
        List<Integer> secondLine = new ArrayList<>();
        secondLine.add(4);
        secondLine.add(5);
        secondLine.add(6);
        integerList.add(secondLine);
        List<Integer> thirdLine = new ArrayList<>();
        thirdLine.add(10);
        thirdLine.add(8);
        thirdLine.add(-12);
        integerList.add(thirdLine);
        System.out.println(diagonalDifference(integerList));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumDigFirst = 0;
        int sumDigSecond = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == j) {
                    sumDigFirst = sumDigFirst + arr.get(i).get(j);
                }
                if ((i + j) == (arr.size() -1)) {
                    sumDigSecond = sumDigSecond + arr.get(i).get(j);
                }
            }
        }

        return Math.abs(sumDigFirst-sumDigSecond);
    }


}
