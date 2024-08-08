package ECOO.Year_2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class P1_Email {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int N = Integer.parseInt(user.readLine());
            HashSet<String> check = new HashSet<>();

            for (int j = 0; j < N; j++) {
                String in = user.readLine().toLowerCase();
                int atI = in.indexOf('@');
                String fP = in.substring(0, atI).replace(".", "");

                if (fP.contains("+")) {
                    in = fP.substring(0, fP.indexOf('+')) + in.substring(atI);
                } else {
                    in = fP + in.substring(atI);
                }

                check.add(in);
            }

            System.out.println(check.size());
        }
    }
}
