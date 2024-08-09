package DMOPC.Year_2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2_Knitting_Scarves {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(user.readLine());

        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int[] prev = new int[N + 2]; // Previous node.
        int[] next = new int[N + 2]; // Next node.

        for (int i = 0; i < N + 1; i++) {
            prev[i] = i - 1;
            next[i] = i + 1;
        }

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(user.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            if (prev[L] != K) { // Making sure it doesn't try adding L -> R to the same spots and wasting time.
                int l = prev[L];
                int r = next[R];
                int k = next[K];

                prev[L] = K;
                next[R] = k;
                next[K] = L;
                next[l] = r;
                prev[r] = l;
                prev[k] = R;
            }
        }

        int colour = 0;
        while (next[colour] != N + 1) {
            colour = next[colour];
            System.out.print(colour + " ");
        }
    }
}