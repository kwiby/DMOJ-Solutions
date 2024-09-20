package CCC.Year_2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_Modern_Art {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(user.readLine());
        int N = Integer.parseInt(user.readLine());

        int[] row = new int[M];
        int[] col = new int[N];


        int K = Integer.parseInt(user.readLine());
        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());

            if (st.nextToken().equals("R")) {
                row[Integer.parseInt(st.nextToken()) - 1]++;
            } else {
                col[Integer.parseInt(st.nextToken()) - 1]++;
            }
        }

        int numOfGolds = 0;
        for (int r : row) {
            for (int c : col) {
                if ((r + c) % 2 != 0) {
                    numOfGolds++;
                }
            }
        }

        System.out.println(numOfGolds);
    }
}
