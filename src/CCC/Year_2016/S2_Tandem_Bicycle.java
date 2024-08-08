package CCC.Year_2016;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S2_Tandem_Bicycle {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int totalSpeed = 0;

        int q = Integer.parseInt(user.readLine());
        int N = Integer.parseInt(user.readLine());

        int[] dmoj = new int[N];
        int[] peg = new int[N];

        StringTokenizer st1 = new StringTokenizer(user.readLine());
        StringTokenizer st2 = new StringTokenizer(user.readLine());
        for (int i = 0; i < N; i++) {
            dmoj[i] = Integer.parseInt(st1.nextToken());
            peg[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(dmoj);
        Arrays.sort(peg);

        if (q == 1) {
            for (int i = 0; i < N; i++) {
                totalSpeed += Math.max(dmoj[i], peg[i]);
            }
        } else {
            for (int i = 0; i < N; i++) {
                totalSpeed += Math.max(dmoj[i], peg[N - 1 - i]);
            }
        }

        System.out.println(totalSpeed);
    }
}
