package CCC.Year_2007;

import java.io.*;
import java.util.HashMap;

public class J4_Anagram_Checker {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        String a = user.readLine();
        String b = user.readLine();

        HashMap<Character, Integer> A = new HashMap<>();
        HashMap<Character, Integer> B = new HashMap<>();

        for (char c : a.toCharArray()) {
            if (c != ' ') {
                if (!A.containsKey(c)) {
                    A.put(c, 1);
                } else {
                    A.put(c, A.get(c) + 1);
                }
            }
        }

        for (char c : b.toCharArray()) {
            if (c != ' ') {
                if (!B.containsKey(c)) {
                    B.put(c, 1);
                } else {
                    B.put(c, B.get(c) + 1);
                }
            }
        }

        if (A.equals(B)) System.out.println("Is an anagram.");
        else System.out.println("Is not an anagram.");
    }
}
