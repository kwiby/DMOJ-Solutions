package CCC.Year_2017;

import java.io.*;
import java.util.StringTokenizer;

public class S1_Sum_Game {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int runs = Integer.parseInt(user.readLine());

        int[] psa1 = new int[runs + 1];
        int[] psa2 = new int[runs + 1];

        StringTokenizer st = new StringTokenizer(user.readLine());
        for (int i = 1; i < psa1.length; i++) {
            psa1[i] = psa1[i - 1] + Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(user.readLine());
        for (int i = 1; i < psa2.length; i++) {
            psa2[i] = psa2[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = runs; i >= 0; i--) {
            if (psa1[i] == psa2[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
