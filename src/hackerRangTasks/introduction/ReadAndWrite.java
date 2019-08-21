package hackerRangTasks.introduction;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Islombek Karimov.
 */
public class ReadAndWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter n: ");
            boolean n;
            if (sc.hasNext()) n = true;
            else n = false;
            System.out.println(n);
//            System.out.println("Enter words: ");
            String newWord = null;
            StringBuilder stringBuilder = null;
            PrintWriter writer = new PrintWriter("E:\\java.txt");
            newWord = sc.nextLine();
                    stringBuilder = new StringBuilder();
                    newWord = sc.nextLine();
                    stringBuilder.append(n + " " + newWord);
                    writer.println(stringBuilder);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            InputStreamReader fileReader = new InputStreamReader(new FileInputStream("E:\\java.txt"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String output;
            while ((output = bufferedReader.readLine()) != null) {
            System.out.println(output);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
