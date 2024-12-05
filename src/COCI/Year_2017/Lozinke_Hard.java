package COCI.Year_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lozinke_Hard {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int Q = Integer.parseInt(user.readLine());
        Map<String, Integer> strs = new HashMap<>();
        for (int i = 0; i < Q; i++) {
            String in = user.readLine();
            String str = in.substring(2);

            if (in.charAt(0) == '1') {
                Set<String> test = new HashSet<>();

                for (int j = 0; j < str.length(); j++) {
                    for (int k = j; k < str.length(); k++) {
                        String temp = str.substring(j, k + 1);
                        if (!test.contains(temp)) {
                            strs.put(temp, strs.getOrDefault(temp, 0) + 1);
                            test.add(temp);
                        }
                    }
                }
            } else {
                System.out.println(strs.getOrDefault(str, 0));
            }
        }
    }
}
