package Back_To_School.Year_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Letter_Frequency {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        String S = user.readLine();
        int[][] psa = new int[26][S.length() + 1];

        for (int i = 1; i <= S.length(); i++) {
            if (S.charAt(i - 1) != ' ') {
                psa[S.charAt(i - 1) - 'a'][i]++;
            }

            for (int j = 0; j < 26; j++) {
                psa[j][i] += psa[j][i - 1];
            }
        }

        int Q = Integer.parseInt(user.readLine());
        for (int i = 0; i < Q; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);

            System.out.println(psa[c - 'a'][R] - psa[c - 'a'][L - 1]);
        }
    }
}
