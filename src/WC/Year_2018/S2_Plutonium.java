package WC.Year_2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_Plutonium {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(user.readLine()); // # of days of operation.
        int[] O = new int[N];

        boolean checkContinue = true;

        StringTokenizer st = new StringTokenizer(user.readLine());
        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (i - num >= 0) {
                O[i - 1] = num;
            } else {
                System.out.println("-1");
                checkContinue = false;
                break;
            }
        }

        if (checkContinue) {
            // [num -  2] (not '- 1' because withdrawals happen before a new box is added!) is the amount of days there
            // cannot have been withdrawals previous to the current observation day. As such, the first withdrawal that
            // is possible before the current observation day, is one day before [num - 2] previous day(s) -> [num - 3].

            // Also, another possibility, is that if the maximum # of withdrawals is greater than 0, than the minimum #
            // of withdrawals will always be 1.

        }
    }
}
