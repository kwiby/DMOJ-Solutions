package CCC.Year_2014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class S2_Assigning_Partners {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(user.readLine());
        String[][] names  = {user.readLine().split(" "), user.readLine().split(" ")};

        boolean valid = true;

        for (int i = 0; i < N; i++) {
            if (names[0][i].equals(names[1][i])) {
                valid = false;
                break;
            }

            int checkIndex = 0;

            for (int j = 0; j < N; j++) {
                if (names[0][i].equals(names[1][j])) {
                    checkIndex = j;
                    break;
                }
            }

            if (!names[1][i].equals(names[0][checkIndex])) {
                valid = false;
                break;
            }
        }

        if (valid) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }

        /*HashMap<String, String> hm1 = new HashMap<>();
        HashMap<String, String> hm2 = new HashMap<>();

        StringTokenizer st = new StringTokenizer(user.readLine());
        for (int i = 0; i < N; i++) {
            String in = st.nextToken();

            if (in.equals(top[i])) {
                hm1.put("0", "0");
                break;
            }

            hm1.put(top[i], in);
            hm2.put(in, top[i]);
        }

        if (hm1.equals(hm2)) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }*/
    }
}
