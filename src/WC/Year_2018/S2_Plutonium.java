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

        if (O[0] != 1) {
            O[0] = 1;
        }

        if (checkContinue) {
            // [num -  2] (not '- 1' because withdrawals happen before a new box is added!) is the amount of days there
            // cannot have been withdrawals previous to the current observation day. As such, the first withdrawal that
            // is possible before the current observation day, is one day before [num - 2] previous day(s) -> [num - 3].

            // Also, another possibility, is that if the maximum # of withdrawals is greater than 0, than the minimum #
            // of withdrawals will always be 1.
            int maxWithdrawalsCount = 0;
            boolean breakCheck = false;
            int num = 1;

            for (int i = N - 1; i >= 0; i -= num) {
                if (O[i] == 0) {
                    maxWithdrawalsCount++;
                } else {
                    // I: {0 1 2 3} --> E: {1 0 0 4}
                    // I: {0 1 2 3 4 5} --> E: {1 0 0 0 3 0}
                    //System.out.println(num);
                    num = O[i];
                    int checkNum = num - 1;

                    for (int j = i - 1; j > i - num; j--) {
                        if (O[j] == checkNum || O[j] == 0) {
                            checkNum--;
                        } else {
                            System.out.println("-1");
                            breakCheck = true;
                            break;
                        }
                    }

                    if (breakCheck) {
                        break;
                    } else if (i != 0) {
                        maxWithdrawalsCount++;
                    }
                }
            }

            if (!breakCheck) {
                if (maxWithdrawalsCount != 0) {
                    System.out.println(1 + " " + maxWithdrawalsCount);
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }
}