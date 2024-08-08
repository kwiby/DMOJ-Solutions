package CCC.Year_2004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J4_Simple_Encryption {
    public static void main(String[] args) throws IOException  {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        String key = user.readLine();

        String tempStr = user.readLine();
        String str = "";
        for (int i = 0; i < tempStr.length(); i++) {
            if ((int) tempStr.charAt(i) >= 65 && (int) tempStr.charAt(i) <= 90) {
                str += tempStr.charAt(i);
            }
        }

        int keyI = 0;
        for (char c : str.toCharArray()) {
            int nxt = (int) c + (int) key.charAt(keyI) - 65;

            if (nxt > 90) {
                nxt %= 90;
                nxt += 64;
            }

            System.out.print((char) nxt);

            keyI++;
            if (keyI == key.length()) {
                keyI = 0;
            }
        }
    }
}
