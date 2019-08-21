package hackerRangTasks.introduction;

import java.security.Permission;
import java.util.Scanner;

/**
 * Created by Islombek Karimov.
 */
public class IntToString {

    public static void main(String[] args) {
        DoNotTerminate.forbidExit();
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();
            String s = ""+ n;
            if (n == Integer.parseInt(s)){
                System.out.println("Good job");
            }
            else {
                System.out.println("Wrong answer");
            }
        }
        catch (DoNotTerminate.ExitTrappedException e){
            System.out.println("Unsuccessful Termination!!");
        }
    }
    }
    class DoNotTerminate {

        public static class ExitTrappedException extends SecurityException {

            private static final long serialVersionUID = 1;
        }

        public static void forbidExit() {
            final SecurityManager securityManager = new SecurityManager() {
                @Override
                public void checkPermission(Permission permission) {
                    if (permission.getName().contains("exitVM")) {
                        throw new ExitTrappedException();
                    }
                }
            };
            System.setSecurityManager(securityManager);
        }

}
