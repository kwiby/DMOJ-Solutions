package OTHS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J3_Explosion {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(user.readLine());

        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int[] diff = new int[N - 1];

        st = new StringTokenizer(user.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N - 2; i++) {
            diff[i] = Math.abs(a - b);
            a = b;
            b = Integer.parseInt(st.nextToken());
        }
        diff[N - 2] = Math.abs(a - b);

        int count = 1;
        for (int i = 0; i < diff.length; i++) {
            if (diff[i] > D) {
                count++;
            }
        }

        int highestConsec = 1;
        int consecCount = 1;
        for (int value : diff) {
            if (value <= D) {
                consecCount++;
                if (consecCount > highestConsec) {
                    highestConsec = consecCount;
                }
            } else {
                consecCount = 1;
            }
        }

        System.out.println(count + "\n" + highestConsec);
    }
}
