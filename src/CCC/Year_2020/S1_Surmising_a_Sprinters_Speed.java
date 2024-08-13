package CCC.Year_2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S1_Surmising_a_Sprinters_Speed {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(user.readLine()); // # of observations.
        int[][] measurements = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            measurements[i][0] = Integer.parseInt(st.nextToken());
            measurements[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(measurements, (x, y) -> Integer.compare(x[0], y[0]));

        double maxSpeed = 0;

        for (int i = 0; i < N - 1; i++) {
            maxSpeed = Math.max(maxSpeed, (double) Math.abs(measurements[i + 1][1] - measurements[i][1]) / (measurements[i + 1][0] - measurements[i][0]));
        }

        System.out.println(maxSpeed);
    }
}
