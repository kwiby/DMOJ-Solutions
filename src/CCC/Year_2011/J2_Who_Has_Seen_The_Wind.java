package CCC.Year_2011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2_Who_Has_Seen_The_Wind {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int h = Integer.parseInt(user.readLine());
        int M = Integer.parseInt(user.readLine());
        int t = 1;
        double A = -6 * Math.pow(t, 4) + h * Math.pow(t, 3) + 2 * Math.pow(t, 2) + t;

        while (t <= M && A > 0) {
            t++;
            A = -6 * Math.pow(t, 4) + h * Math.pow(t, 3) + 2 * Math.pow(t, 2) + t;
        }

        if (A <= 0 && t <= M) {
            System.out.println("The balloon first touches ground at hour:\n" + t);
        } else {
            System.out.println("The balloon does not touch ground in the given time.");
        }
    }
}