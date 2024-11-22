package VM7WC.Year_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_GG {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        String str = user.readLine();
        int Q = Integer.parseInt(user.readLine());

        int[] psa = new int[str.length() + 1];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'G') {
                psa[i + 1] = psa[i] + 1;
            } else {
                psa[i + 1] = psa[i];
            }
        }

        for (int i = 0; i < Q; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());

            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken()) + 1;

            System.out.println(psa[r] - psa[l]);
        }
    }
}