package CCC.Year_2011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J3_Sumac_Sequences {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int count = 2;

        int a = Integer.parseInt(user.readLine());
        int b = Integer.parseInt(user.readLine());

        while (a - b >= 0) {
            count++;
            int temp = b;
            b = a - b;
            a = temp;
        }

        System.out.println(count);
    }
}