import java.io.*;
import java.util.*;

public class CandidateCode {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (isPanicAttack(n)) {
                System.out.println("Panic Attack");
            } else {
                System.out.println("Happy Face");
            }
        }
    }

    public static boolean isPanicAttack(int n) {
        // Check if the number is 17
        if (n == 17) {
            return true;
        }

        // Check if the number is divisible by 17
        if (n % 17 == 0) {
            return true;
        }

        // Check if the number contains 17 as part of it
        String numStr = Integer.toString(n);
        if (numStr.contains("17")) {
            return true;
        }

        return false;
    }
}
