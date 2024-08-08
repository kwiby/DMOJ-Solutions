package CCC.Year_2004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class S1_Fix {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Character> prefix = new HashSet<>();
        HashSet<Character> suffix = new HashSet<>();

        int N = Integer.parseInt(user.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                String str = user.readLine();

                prefix.add(str.charAt(0));
                suffix.add(str.charAt(str.length() - 1));
            }

            if (prefix.size() >= 2 && suffix.size() >= 2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            prefix.clear();
            suffix.clear();
        }
    }
}
