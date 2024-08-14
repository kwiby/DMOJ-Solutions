package SAC.Year_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P3_Bob_Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(user.readLine()); // # of elements.
        Integer[] A = new Integer[N];
        int maxNum = 0;

        StringTokenizer st = new StringTokenizer(user.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            maxNum = Math.max(maxNum, num);
            A[i] = num;
        }

        int r = (int) Math.log10(maxNum) + 1;

        for (int i = 1; i <= r; i++) {
            int I = i;
            double pow = Math.pow(10, I);
            Arrays.sort(A, (x, y) -> Double.compare(x % pow, y % pow));

            for (int j = 0; j < N; j++) {
                if (j < N - 1) {
                    System.out.print(A[j] + " ");
                } else {
                    System.out.print(A[j]);
                }
            }
            System.out.println();
        }
    }
}
