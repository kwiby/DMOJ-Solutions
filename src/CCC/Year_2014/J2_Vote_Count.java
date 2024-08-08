package CCC.Year_2014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2_Vote_Count {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int A = 0;
        int B = 0;

        user.readLine();

        for (char c : user.readLine().toCharArray()) {
            if (c == 'A') {
                A++;
            } else {
                B++;
            }
        }

        if (A > B) {
            System.out.println('A');
        } else if (B > A) {
            System.out.println('B');
        } else {
            System.out.println("Tie");
        }
    }
}
