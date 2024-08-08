package DMOPC.Year_2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1_Partial_Game {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        double odd = 0;
        double even = 0;

        user.readLine();

        StringTokenizer st = new StringTokenizer(user.readLine());
        while (st.hasMoreTokens()) {
            double input = Double.parseDouble(st.nextToken());
            if (input % 2 == 0) {
                even += input / 2;
            } else {
                odd += input / 2 + 1;
            }
        }

        if (even > odd) {
            System.out.println("Duke");
        } else {
            System.out.println("Alice");
        }
    }
}