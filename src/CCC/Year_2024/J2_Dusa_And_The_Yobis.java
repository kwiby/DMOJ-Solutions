package CCC.Year_2024;

import java.io.*;

public class J2_Dusa_And_The_Yobis {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int D = Integer.parseInt(user.readLine());

        while (true) {
            int in = Integer.parseInt(user.readLine());
            if (in < D) {
                D += in;
            } else {
                break;
            }
        }

        System.out.println(D);
    }
}
