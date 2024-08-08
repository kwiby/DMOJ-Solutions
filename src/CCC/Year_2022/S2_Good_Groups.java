package CCC.Year_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S2_Good_Groups {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(user.readLine());
        String[][] same = new String[X][2];
        for (int i = 0; i < X; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            same[i][0] = st.nextToken();
            same[i][1] = st.nextToken();
        }

        int Y = Integer.parseInt(user.readLine());
        String[][] diff = new String[Y][2];
        for (int i = 0; i < Y; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            diff[i][0] = st.nextToken();
            diff[i][1] = st.nextToken();
        }

        int G = Integer.parseInt(user.readLine());
        Map<String, Integer> groups = new HashMap<>();
        for (int i = 1; i <= G; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            for (int j = 0; j < 3; j++) {
                groups.put(st.nextToken(), i);
            }
        }

        int violations = 0;

        for (int i = 0; i < X; i++) {
            if (!groups.get(same[i][0]).equals(groups.get(same[i][1]))) {
                violations++;
            }
        }

        for (int i = 0; i < Y; i++) {
            if (groups.get(diff[i][0]).equals(groups.get(diff[i][1]))) {
                violations++;
            }
        }

        System.out.println(violations);

        /*int X = Integer.parseInt(user.readLine());
        Map<String, Set<String>> same = new HashMap<>();
        for (int i = 0; i < X; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            same.computeIfAbsent(st.nextToken(), x -> new HashSet<>()).add(st.nextToken()); // If the key exists in the map, add the second value to it. If it doesn't exist, map a new HashSet to the new key.
        }

        int Y = Integer.parseInt(user.readLine());
        Map<String, Set<String>> diff = new HashMap<>();
        for (int i = 0; i < Y; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            diff.computeIfAbsent(st.nextToken(), x -> new HashSet<>()).add(st.nextToken()); // If the key exists in the map, add the second value to it. If it doesn't exist, map a new HashSet to the new key.
        }

        int G = Integer.parseInt(user.readLine());
        int violations = 0;
        for (int i = 0; i < G; i++) {
            Set<String> group = new HashSet<>();
            StringTokenizer st = new StringTokenizer(user.readLine());
            for (int j = 0; j < 3; j++) {
                group.add(st.nextToken());
            }
            for (String x : group) {
                if (group.contains(x) && same.containsKey(x)) {
                    for (String str : same.get(x)) {
                        if (!group.contains(str)) {
                            violations++;
                        }
                    }
                }
                if (group.contains(x) && diff.containsKey(x)) {
                    for (String str : diff.get(x)) {
                        if (group.contains(str)) {
                            violations++;
                        }
                    }
                }
            }
        }

        System.out.println(violations);*/
    }
}
