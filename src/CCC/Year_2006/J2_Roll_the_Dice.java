package CCC.Year_2006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2_Roll_the_Dice {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(user.readLine());
        int n = Integer.parseInt(user.readLine());

        int count = 0;

        for (int i = 1; i <= m; i++) {
            if (10 - i > 0 && 10 - i <= n) {
                count++;
            }
        }

        if (count == 1) System.out.println("There is 1 way to get the sum 10.");
        else System.out.println("There are " + count + " ways to get the sum 10.");
    }
}
