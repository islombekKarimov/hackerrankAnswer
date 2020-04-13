package hackerRangTasks.problems;

/**
 * Created by acer i5 on 13.04.2020.
 */
public class Staircase {
    public static void main(String[] args) {
            staircase(6);
    }


    static void staircase(int n) {
        StringBuilder stringBuilder = new StringBuilder("#");
        for (int i = 0; i < n; i++) {
            System.out.printf("%" + n + "s\n", stringBuilder);
            stringBuilder.append("#");
        }

    }

}
