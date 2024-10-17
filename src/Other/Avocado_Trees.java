package Other;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Avocado_Trees {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(user.readLine());
        int N = Integer.parseInt(st.nextToken()); // # of trees
        int Q = Integer.parseInt(st.nextToken()); // # of ranges
        int H = Integer.parseInt(st.nextToken()); // Max height

        Map<Integer, List<Integer>> info = new HashMap<>();
        info.put(0, Arrays.asList(0, 0));

        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(user.readLine());

            int height = Integer.parseInt(st.nextToken());
            int yield = Integer.parseInt(st.nextToken());

            if (height <= H) {
                info.put(i, Arrays.asList(info.get(i - 1) + height, yield));
            }
        }

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(user.readLine());

            int l = Integer.parseInt(st.nextToken()) - 1;
            int r = Integer.parseInt(st.nextToken());


        }
    }
}