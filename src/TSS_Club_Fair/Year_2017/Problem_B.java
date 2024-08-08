package TSS_Club_Fair.Year_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem_B {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(user.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        double[] distances = new double[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(user.readLine());
            distances[i] = Math.sqrt(Math.pow(Integer.parseInt(st.nextToken()), 2) + Math.pow(Integer.parseInt(st.nextToken()), 2));
        }

        Arrays.sort(distances);
        System.out.println(Arrays.toString(distances));

        for (int i = 0; i < Q; i++) {
            int check = Integer.parseInt(user.readLine());

            int L = 0, R = distances.length - 1;
            while (L <= R) {
                int mid = L + (R - L) / 2;

                if (distances[mid] > check) {
                    R = mid - 1;
                } else {
                    L = mid + 1;
                }
            }

            System.out.println(L);
        }
    }
}
