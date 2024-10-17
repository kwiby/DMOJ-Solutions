package OTHS.Contest_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1_Math_Assistance {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(user.readLine());
        int b = Integer.parseInt(user.readLine());

        if (a == 0 || b == 0) {
            System.out.println("0");
        } else {
            System.out.println(a + b);
        }
    }
}
