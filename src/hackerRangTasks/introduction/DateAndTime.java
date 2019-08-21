package hackerRangTasks.introduction;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Created by Islombek Karimov.
 */
public class DateAndTime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        String day = sc.next();
        String year = sc.next();
        System.out.println(getDate(day,month,year));
    }

    public static String getDate(String day, String month, String year){
        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);
        LocalDate cal = LocalDate.of(y,m,d);
        return cal.getDayOfWeek().toString();
    }

}
