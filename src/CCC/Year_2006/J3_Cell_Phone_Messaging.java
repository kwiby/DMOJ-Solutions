package CCC.Year_2006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import static java.util.Map.entry;

public class J3_Cell_Phone_Messaging {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        Map<Character, Integer> noPausesTimes = Map.ofEntries(
                entry('a', 1), entry('b', 2), entry('c', 3), entry('d', 1),
                entry('e', 2), entry('f', 3), entry('g', 1), entry('h', 2),
                entry('i', 3), entry('j', 1), entry('k', 2), entry('l', 3),
                entry('m', 1), entry('n', 2), entry('o', 3), entry('p', 1),
                entry('q', 2), entry('r', 3), entry('s', 4), entry('t', 1),
                entry('u', 2), entry('v', 3), entry('w', 1), entry('x', 2),
                entry('y', 3), entry('z', 4)
        );

        while (true) {
            String input = user.readLine();
            if (input.equals("halt")) {
                break;
            }

            int time = 0;

            char previousC = '0';
            for (char c : input.toCharArray()) {
                time += noPausesTimes.get(c);

                if (previousC != '0' && c == previousC) {
                    time += 2;
                }

                previousC = c;
            }
        }
    }
}
