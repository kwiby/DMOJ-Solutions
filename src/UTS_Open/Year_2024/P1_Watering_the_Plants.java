package UTS_Open.Year_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1_Watering_the_Plants {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        long N = Integer.parseInt(user.readLine());
        long K = Integer.parseInt(user.readLine());

        if (K >= N) {
            System.out.println(N * 2);
        } else {
            long minDist = 0;

            for (long i = N; i > 0; i -= K) {
                minDist += i * 2;
            }

            System.out.println(minDist);
        }
    }
}
