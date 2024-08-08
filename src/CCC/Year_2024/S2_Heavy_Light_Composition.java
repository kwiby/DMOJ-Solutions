package CCC.Year_2024;

import java.io.*;
import java.util.StringTokenizer;

public class S2_Heavy_Light_Composition {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(user.readLine());
        int T = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            String str = user.readLine();
            boolean previous = false; // false = light, true = heavy
            char out = 'T';

            for (int j = 0; j < N; j++) {
                if (j != 0) {
                    if ((str.substring(0, j) + str.substring(j + 1)).contains("" + str.charAt(j))) {
                        if (previous) {
                            out = 'F';
                            break;
                        }
                        previous = true;
                    } else {
                        if (!previous) {
                            out = 'F';
                            break;
                        }
                        previous = false;
                    }
                } else {
                    if (str.substring(1).contains("" + str.charAt(j))) {
                        previous = true;
                    }
                }
            }
            System.out.println(out);
        }
    }
}
