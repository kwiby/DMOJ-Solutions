package CCC.Year_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S2_High_Tide_Low_Tide {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(user.readLine());
        int[] measurements = new int[N];

        StringTokenizer st = new StringTokenizer(user.readLine());
        for (int i = 0; i < N; i++) {
            measurements[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(measurements);

        if (N % 2 == 0) {
            for (int i = 0; i < N / 2; i++) {
                System.out.print(measurements[N / 2 - 1 - i] + " " + measurements[N / 2 + i] + " ");
            }
        } else {
            for (int i = 0; i < N / 2; i++) {
                System.out.print(measurements[N / 2 - i] + " " + measurements[N / 2 + 1 + i] + " ");
            }
            System.out.print(measurements[0]);
        }
    }
}