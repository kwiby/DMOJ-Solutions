package COCI.Year_2006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Regional_3_Firefly {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(user.readLine());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int[] t = new int[N / 2];
        int[] b = new int[N / 2];

        for (int i = 0; i < N / 2; i++) {
            t[i] = Integer.parseInt(user.readLine());
            b[i] = Integer.parseInt(user.readLine());
        }

        Arrays.sort(t);
        Arrays.sort(b);

        int leastHits = Integer.MAX_VALUE;
        int numOfLeastHits = 0;

        for (int i = 1; i <= H; i++) {
            int tL = 0, tR = t.length - 1;
            while (tL <= tR) {
                int mid = tL + (tR - tL) / 2;

                if (t[mid] >= H - (i - 1)) {
                    tR = mid - 1;
                } else {
                    tL = mid + 1;
                }
            }

            int bL = 0, bR = b.length - 1;
            while (bL <= bR) {
                int mid = bL + (bR - bL) / 2;

                if (b[mid] >= i) {
                    bR = mid - 1;
                } else {
                    bL = mid + 1;
                }
            }

            int temp = (t.length - tL) + (b.length - bL);
            if (temp < leastHits) {
                leastHits = temp;
                numOfLeastHits = 1;
            } else if (temp == leastHits) {
                numOfLeastHits++;
            }
        }

        System.out.println(leastHits + " " + numOfLeastHits);
    }
}
