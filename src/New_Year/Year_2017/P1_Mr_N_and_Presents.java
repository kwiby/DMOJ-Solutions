package New_Year.Year_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1_Mr_N_and_Presents {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int Q = Integer.parseInt(user.readLine());

        /*Map<String, Integer> map = new HashMap<>();

        int minI = 0;
        int maxI = 0;

        for (int i = 0; i < Q; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            String option = st.nextToken();

            if (option.equals("F")) {
                map.put(st.nextToken(), ++maxI);
            } else if (option.equals("E")) {
                map.put(st.nextToken(), --minI);
            } else {
                map.remove(st.nextToken());
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())); // Google says this sorts in reverse order, compared to 'list.sort(Map.Entry.comparingByValue());' which sorts in non-reverse order.

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey());
        }*/

        Deque<Pair> deque = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < Q; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            String option = st.nextToken();

            if (option.equals("F")) {
                deque.addFirst(new Pair(Integer.parseInt(st.nextToken()), i));
            } else if (option.equals("E")) {
                deque.addLast(new Pair(Integer.parseInt(st.nextToken()), i));
            } else {
                map.put(Integer.parseInt(st.nextToken()), i);
            }
        }
        
        for (Pair x : deque) {
            if (!map.containsKey(x.val) || map.get(x.val) < x.inx) {
                System.out.println(x.val);
            }
        }
    }

    static class Pair {
        int val;
        int inx;

        Pair(int value, int index) {
            val = value;
            inx = index;
        }
    }
}
