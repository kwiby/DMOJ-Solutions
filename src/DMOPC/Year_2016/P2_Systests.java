package DMOPC.Year_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2_Systests {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int B = Integer.parseInt(user.readLine());
        int[][] info = new int[B][3];

        int points = 0;

        for (int i = 0; i < B; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            info[i][0] = Integer.parseInt(st.nextToken());
            info[i][1] = Integer.parseInt(st.nextToken());
            info[i][2] = Integer.parseInt(st.nextToken());
        }

        int F = Integer.parseInt(user.readLine());
        int[] failedCases = new int[F];
        for (int i = 0; i < F; i++) {
            failedCases[i] = Integer.parseInt(user.readLine());
        }

        Arrays.sort(failedCases);

        for (int i = 0; i < B; i++) {
            System.out.println("0: " + info[i][0]);
            System.out.println("1: " + info[i][1]);
            if (info[i][0] > failedCases[F - 1]) {
                points += info[i][2];
            }
        }

        System.out.println(points);
    }
}
