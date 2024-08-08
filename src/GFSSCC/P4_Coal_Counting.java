package GFSSCC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P4_Coal_Counting {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(user.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] naughtiness = new int[N];
        st = new StringTokenizer(user.readLine());
        for (int i = 0; i < N; i++) {
            naughtiness[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(naughtiness);

        st = new StringTokenizer(user.readLine());
        for (int i = 0; i < M; i++) {
            int check = Integer.parseInt(st.nextToken());

            int L = 0, R = naughtiness.length - 1;
            while (L <= R) {
                int mid = L + (R - L) / 2;

                if (naughtiness[mid] >= check) {
                    R = mid - 1;
                } else {
                    L = mid + 1;
                }
            }

            System.out.println(N - L);
        }
    }
}
