package CCC.Year_2005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2_RSA_Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(user.readLine());
        int b = Integer.parseInt(user.readLine());

        int count = 0;

        for (int i = a; i <= b; i++) {
            int divisibles = 2;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    divisibles++;
                }

                if (divisibles > 4) {
                    break;
                }
            }

            if (divisibles == 4) {
                count++;
            }
        }

        System.out.println("The number of RSA numbers between " + a + " and " + b + " is " + count);
    }
}
