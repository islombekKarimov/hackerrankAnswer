package hackerRangTasks.introduction;

import java.util.Scanner;

/**
 * Created by acer i5 on 21.07.2017.
 */
public class WelcomeToJava {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int s, count=0;
        for(int i=0;i<t;i++){
            s=0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            s += a;
            for(int j=0; j<n; j++){
                s += (Math.pow(2,j)*b);
                count++;
                System.out.print(s   + " ");

            }
                   System.out.println();
        }
        in.close();

    }
}
