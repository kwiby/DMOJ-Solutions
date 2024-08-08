package The_Cosmic_Era;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2_Uneven_Sand {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        long L = 1, R = 2000000000;
        while (true) {
            long mid = (R + L) / 2;

            System.out.println(mid);

            String str = user.readLine();
            if (str.equals("SINKS")) {
                L = mid + 1;
            } else if (str.equals("FLOATS")) {
                R = mid - 1;
            } else {
                break;
            }
        }
    }
}
