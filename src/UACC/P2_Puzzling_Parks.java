package UACC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2_Puzzling_Parks {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(user.readLine());
        int a = (length + 1) / 4;
        int b = length - 2;
        int c = a * 3 + b - a + 1;

        System.out.println(c);

        /*
        int top = 0;
        double bottom = 0;

        int length = Integer.parseInt(user.readLine());

        double a = (double) (length - 1) / 4;
        int b = (int) a;

        if (b * 4 == length - 2) {
            top = b * 3 + 1;
            bottom = length / 4 * 3;
        } else {
            top = b * 3 + (int) ((a - b) * 3);
            bottom = (double) length / 4 * 3;

            if ((length + 1) % 4 == 0) {
                bottom = Math.ceil(bottom);
            } else {
                bottom = Math.floor(bottom);
            }
        }

        int time = (int) (top + bottom);
        System.out.println(time);
        */
    }
}
