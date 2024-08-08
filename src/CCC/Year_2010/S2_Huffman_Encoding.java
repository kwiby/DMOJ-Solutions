package CCC.Year_2010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_Huffman_Encoding {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(user.readLine());

        String[] a = new String[k];
        String[] b = new String[k];

        for (int i = 0; i < k; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            a[i] = st.nextToken();
            b[i] = st.nextToken();
        }

        String str = user.readLine();
        int startIndex = str.length() - 1; // The left-most index of the substring.

        for (int i = b.length - 1; i >= 0; i--) { // For every binary sequence.
            String previousTemp = str.substring(str.length() - b[i].length()); /* The starting substring -> Ex:
                                                                                  str = 1010[101] -> sequence length of 3
                                                                                  sequences = A-10, B-101 -> AAB

                                                                                */

            for (int j = startIndex; j >= b[i].length() - 1; j -= b[i].length()) {
                String temp = str.substring(j - b[i].length() + 1, j + 1);
                temp = temp.replaceAll(b[i], a[i]);
                if (temp.equals(previousTemp)) {
                    startIndex = j;
                    break;
                }
                
                previousTemp = temp;
            }
        }//E:  1 2 3 4 5 6 X
         //I:  0 1 2 3 4 5 6

        System.out.println(str);
    }
}