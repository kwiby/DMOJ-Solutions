package CCC.Year_2003;

import java.io.*;
import java.util.Arrays;

public class S2_Poetry {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        String vowels = "aeiou";

        int verses = Integer.parseInt(user.readLine());

        for (int i = 0; i < verses; i++) {
            String[] ends = {"", "", "", ""};

            for (int j = 0; j < 4; j++) {
                String line = user.readLine();
                System.out.println("line = " + line);
                boolean firstVowel = false;

                for (int k = line.length() - 1; k > 0; k--) {
                    boolean isVowel = vowels.contains("" + line.charAt(k));
                    System.out.println("isVowel = " + isVowel);

                    if (line.charAt(k) == ' ' || (!isVowel && firstVowel && line.charAt(k) != ' ')) {
                        break;
                    } else {
                        if (isVowel) {
                            firstVowel = true;
                        }
                        ends[j] += line.charAt(k);
                    }
                }
            }

            System.out.println(Arrays.toString(ends));
            if (ends[0].equals(ends[1]) && ends[1].equals(ends[2]) && ends[2].equals(ends[3])) {
                System.out.println("perfect");
            } else if (ends[0].equals(ends[1]) && !ends[1].equals(ends[2]) && ends[2].equals(ends[3])) {
                System.out.println("even");
            } else if (ends[0].equals(ends[2]) && !ends[1].equals(ends[2]) && ends[1].equals(ends[3])) {
                System.out.println("cross");
            } else if (ends[0].equals(ends[3]) && !ends[0].equals(ends[1]) && ends[1].equals(ends[2])) {
                System.out.println("shell");
            } else {
                System.out.println("free");
            }
        }
    }
}
