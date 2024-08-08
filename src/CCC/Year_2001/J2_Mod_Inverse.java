package CCC.Year_2001;

import java.io.*;

public class J2_Mod_Inverse {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(user.readLine());
        int m = Integer.parseInt(user.readLine());

        boolean check = false;

        int n;

        for (n = 1; n < m; n++) {
            if ((x * n) % m == 1) {
                check = true;
                break;
            }
        }

        if (check) {
            System.out.println(n);
        } else {
            System.out.println("No such integer exists.");
        }
    }
}
