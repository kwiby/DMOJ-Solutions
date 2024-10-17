package OTHS.Contest_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J4_Railgun {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(user.readLine());
        int N = Integer.parseInt(st.nextToken()); // numOfRobots
        int S = Integer.parseInt(st.nextToken()); // destroyCount
        int T = Integer.parseInt(st.nextToken()); // usesLeft

        int[] psa = new int[N + 1];

        st = new StringTokenizer(user.readLine());
        for (int i = 1; i <= N; i++) {
            psa[i] += psa[i - 1] + Integer.parseInt(st.nextToken());
        }

        if (S * T >= N) {
            System.out.println(psa[N]);
        } else {
            int totalPowerWeakened = 0;

            for (int i = 0; i < T; i++) { // Finding all possible combinations of railgun shots.
                    // For 'usesLeft = 3', if L is 0 shots (left sum = 0), that means R has to be 3 shots (right sum = total sum
                    // of the 3 'destroyCount' sums -> if destroyCount = 1, it would be the sum of the first 3 numbers/powers
                    // from the right side). If L is 1 shot, that means R has to be 2 shots, and etc!
                    int powerL = psa[i * S];
                    int powerR = psa[N] - psa[N - (T - i) * S];
                    int powerTotal = powerL + powerR; // Getting the total power dealt for the current combination.
                    totalPowerWeakened = Math.max(totalPowerWeakened, powerTotal); // Checking if the current total power dealt is greater or less than the current 'totalPowerWeakened'.
            }

            System.out.println(totalPowerWeakened);
        }
    }
}