package CCC.Year_2005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1_The_Cell_Sell {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int d = Integer.parseInt(user.readLine());
        int e = Integer.parseInt(user.readLine());
        int w = Integer.parseInt(user.readLine());

        double a = d - 100;
        if (a < 0) {
            a = 0;
        }
        double b = d - 250;
        if (b < 0) {
            b = 0;
        }

        double A = (double) Math.round((a * 0.25 + e * 0.15 + w * 0.20) * 100) / 100;
        double B = (double) Math.round((b * 0.45 + e * 0.35 + w * 0.25) * 100) / 100;

        System.out.printf("Plan A costs %.2f\n", A);
        System.out.printf("Plan B costs %.2f\n", B);

        if (A < B) {
            System.out.println("Plan A is cheapest.");
        } else if (B < A) {
            System.out.println("Plan B is cheapest.");
        } else {
            System.out.println("Plan A and B are the same price.");
        }
    }
}
