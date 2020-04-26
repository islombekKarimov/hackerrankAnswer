package hackerRangTasks.problems;

/**
 * Created by Islombek Karimov on 26.04.2020.
 */
public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
    }

    static String timeConversion(String s) {
        String timeType = s.substring(s.length() - 2, s.length());
        String firstNumbers = s.substring(0, 2);
        if (timeType.equals("PM")) {
            switch (firstNumbers) {
                case "01":
                    s = s.replaceAll("01", "13");
                    break;
                case "02":
                    s = s.replaceAll("02", "14");
                    break;
                case "03":
                    s = s.replaceAll("03", "15");
                    break;
                case "04":
                    s = s.replaceAll("04", "16");
                    break;
                case "05":
                    s = s.replaceAll("05", "17");
                    break;
                case "06":
                    s = s.replaceAll("06", "18");
                    break;
                case "07":
                    s = s.replaceAll("07", "19");
                    break;
                case "08":
                    s = s.replaceAll("08", "20");
                    break;
                case "09":
                    s = s.replaceAll("09", "21");
                    break;
                case "10":
                    s = s.replaceAll("10", "22");
                    break;
                case "11":
                    s = s.replaceAll("11", "23");
                    break;
            }
            return s.substring(0, s.length()-2);
        } else if (timeType.equals("AM")) {
            switch (firstNumbers) {
                case "12":
                    s = s.replaceAll("12", "00");
                    break;
            }
            return s.substring(0, s.length() - 2);
        }
        return s.substring(0, s.length() - 2);
    }


}
