package CCC.Year_2006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1_Canadian_Calorie_Counting {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int C = 0;

        int c = Integer.parseInt(user.readLine());
        if (c == 1) C += 461;
        else if (c == 2) C += 431;
        else if (c == 3) C += 420;

        c = Integer.parseInt(user.readLine());
        if (c == 1) C += 100;
        else if (c == 2) C += 57;
        else if (c == 3) C += 70;

        c = Integer.parseInt(user.readLine());
        if (c == 1) C += 130;
        else if (c == 2) C += 160;
        else if (c == 3) C += 118;

        c = Integer.parseInt(user.readLine());
        if (c == 1) C += 167;
        else if (c == 2) C += 266;
        else if (c == 3) C += 75;

        System.out.println("Your total Calorie count is " + C + ".");
    }
}
