package hackerRangTasks.string;

import java.util.Scanner;

/**
 * Created by Islombek Karimov.
 */
public class StringIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        int a = A.compareTo(B);
        int b = B.compareTo(A);
        if(a > b){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        String v = String.valueOf(A.charAt(0));
        String v2 = String.valueOf(B.charAt(0));
        System.out.println(v.toUpperCase() + A.substring(1) + " " +  v2.toUpperCase() + B.substring(1   ));
    }
}
