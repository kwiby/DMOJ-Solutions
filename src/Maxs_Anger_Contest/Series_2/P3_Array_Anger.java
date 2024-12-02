package Maxs_Anger_Contest.Series_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3_Array_Anger {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(user.readLine());
        int N = Integer.parseInt(st.nextToken()); // # of array elements
        int Q = Integer.parseInt(st.nextToken()); // # of queries

        int[] psa = new int[N + 1];

        st = new StringTokenizer(user.readLine());
        int i = 1;
        while (st.hasMoreTokens()) {
            psa[i] = psa[i - 1] + Integer.parseInt(st.nextToken());
            i++;
        }
        
        for (int j = 0; j < Q; j++) {
            st = new StringTokenizer(user.readLine());

            st.nextToken();
            int L = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());

            int l = L;
            int r = N;

            while (l <= r) {
                int mid = r - (r - l) / 2;

                if (psa[mid] - psa[L - 1] < S && mid + 1 <= N) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

            System.out.println(l);
        }
    }
}
