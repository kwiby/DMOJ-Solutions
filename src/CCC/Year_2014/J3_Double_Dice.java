package CCC.Year_2014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J3_Double_Dice {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(user.readLine());

        int A = 100;
        int D = 100;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            int a = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());

            if (a > d) {
                D -= a;
            } else if (d > a) {
                A -= d;
            }
        }

        System.out.println(A);
        System.out.println(D);
    }
}
