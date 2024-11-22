package DMOPC.Year_2014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4_Deforestation {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(user.readLine());
        int[] psa = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            psa[i] = psa[i - 1] + Integer.parseInt(user.readLine());
        }

        int Q = Integer.parseInt(user.readLine());
        for (int i = 0; i < Q; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());

            System.out.println(psa[R + 1] - psa[L]);
        }
    }
}