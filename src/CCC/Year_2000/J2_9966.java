package CCC.Year_2000;

import java.io.*;

public class J2_9966 {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int start = Integer.parseInt(user.readLine());
        int end = Integer.parseInt(user.readLine());

        int count = 0;

        for (int i = start; i <= end; i++, count++) {
            int digits = Integer.toString(i).length();

            for (int j = 0; j < Math.ceil((double) digits / 2); j++) {
                int L = i * 10 / (int) Math.pow(10, digits - j) % 10;
                int R = i * 10 / (int) Math.pow(10, 1 + j) % 10;

                if (!((L == 0 && R == 0) || (L == 1 && R == 1) || (L == 8 && R == 8) || (L == 6 && R == 9) || (L == 9 && R == 6))) {
                    count--;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}