package GFSSOC.Year_2015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class J5_Nightmare_a_thon {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(user.readLine());
        int N = Integer.parseInt(st.nextToken()); // # of episodes.
        int Q = Integer.parseInt(st.nextToken()); // # of queries.

        int[][] psa = new int[10][N];

        st = new StringTokenizer(user.readLine());
        for (int i = 0; i < N; i++) {
            int rating = Integer.parseInt(st.nextToken());
            psa[rating - 1][i]++;
        }

        System.out.println("\npsa = " + Arrays.deepToString(psa));

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(user.readLine());
            int a = Integer.parseInt(st.nextToken()); // L
            int b = Integer.parseInt(st.nextToken()); // R

            int[][] newPsa = new int[10][N + a - b]; // Simplified from [N + 1 - (b - a + 1)].
            System.out.println(Arrays.deepToString(newPsa));
            for (int j = 0; j < 10; j++) {
                int indexAddCount = 0;

                for (int k = 1; k <= newPsa.length; k++) {
                    if (k + indexAddCount < a || k + indexAddCount > b) {
                        newPsa[j][k] = psa[j][k - 1 + indexAddCount];
                    } else {
                        indexAddCount += 2;
                        k--;
                    }

                    newPsa[j][k] += newPsa[j][k - 1];
                }

                System.out.println(Arrays.deepToString(newPsa));
            }
        }
    }
}
