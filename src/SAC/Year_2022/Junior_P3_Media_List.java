package SAC.Year_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Junior_P3_Media_List {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(user.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        ArrayList<HashSet<String>> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(new HashSet<>());
        }

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(user.readLine());

            int option = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            if (option == 1) {
                if (list.get(num - 1).contains(name)) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else {
                list.get(num - 1).add(name);
            }
        }
    }
}
