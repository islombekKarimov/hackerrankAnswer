package hackerRangTasks.string;

//import org.apache.commons.lang3.StringUtils;

import com.sun.deploy.util.StringUtils;

import java.util.*;

/**
 * Created by Islombek Karimov.
 */
public class Anagrams {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        if (a.length() == b.length()) {
            String[] arrA = a.toUpperCase().split("");
            String[] arrB = b.toUpperCase().split("");
            int [] count = new int[0];
            int [] count2 = new int[0];
            boolean ans = false;
            for (int i = 0; i < arrA.length; i++) {
                for (int j = 0; j < arrB.length; j++) {
//                    System.out.println("a ====" + StringUtils.countMatches(a.toUpperCase(), arrA[i]) + "  ==== b " + StringUtils.countMatches(b.toUpperCase(), arrB[j]));
//                    if (StringUtils.countMatches(a.toUpperCase(), arrA[i]) == StringUtils.countMatches(b.toUpperCase(), arrB[j])) {
                        ans = true;
//                    }
                }

            }
            return ans;
        }
        return false;
    }
}