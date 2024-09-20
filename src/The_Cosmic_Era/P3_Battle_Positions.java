package The_Cosmic_Era;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3_Battle_Positions {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int I = Integer.parseInt(user.readLine());
        int N = Integer.parseInt(user.readLine());
        int J = Integer.parseInt(user.readLine());

        int[] psa = new int[I + 1];

        for (int i = 0; i < J; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            psa[L] += K;
            if (R < I) {
                psa[R + 1] -= K;
            }
        }

        int count = 0;
        for (int i = 1; i <= I; i++) {
            psa[i] += psa[i - 1];

            if (psa[i] < N) {
                count++;
            }
        }

        System.out.println(count);
    }
}
