package hackerRangTasks.string;

import java.util.Scanner;

/**
 * Created by Islombek Karimov.
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String [] arr = A.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--){
            stringBuilder.append(arr[i]);
        }
        if (stringBuilder.toString().equals(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
