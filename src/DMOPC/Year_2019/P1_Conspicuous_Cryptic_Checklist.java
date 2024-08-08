package DMOPC.Year_2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1_Conspicuous_Cryptic_Checklist {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(user.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            items.add(user.readLine());
        }

        int count = 0;

        for (int i = 0; i < M; i++) {
            int T = Integer.parseInt(user.readLine());

            boolean check = true;
            for (int j = 0; j < T; j++) {
                if (!items.contains(user.readLine())) {
                    check = false;
                }
            }

            if (check) {
                count++;
            }
        }

        System.out.println(count);
    }
}