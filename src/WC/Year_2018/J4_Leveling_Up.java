package WC.Year_2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class J4_Leveling_Up {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(user.readLine()); // # of wild Pokémon.
        int S = 0; // The initial position of Arbok.
        int L = 0; // The level of Arbok.

        StringTokenizer st = new StringTokenizer(user.readLine());
        S = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        LinkedList<Trio> l = new LinkedList<>();
        LinkedList<Trio> r = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(user.readLine());
            int P = Integer.parseInt(st.nextToken()); // The position of the i-th Pokémon.
            int M = Integer.parseInt(st.nextToken()); // The level of the i-th Pokémon.
            int G = Integer.parseInt(st.nextToken()); // The # of levels that Arbok will increase by.

            if (P < S) {
                l.add(new Trio(P, M, G));
            } else {
                r.add(new Trio(P, M, G));
            }
        }

        l.sort(Comparator.comparingInt(trio -> trio.P));
        r.sort(Comparator.comparingInt(trio -> trio.P));

        while (true) {
            int lM = 0;
            int rM = 0;

            if (!l.isEmpty() && l.getLast().M <= L) {
                lM = l.getLast().M;
            }
            if (!r.isEmpty() && r.getFirst().M <= L) {
                rM = r.getFirst().M;
            }

            if (lM == 0 && rM == 0) {
                break;
            }else if (lM > rM) {
                L += l.getLast().G;
                l.removeLast();
            } else {
                L += r.getFirst().G;
                r.removeFirst();
            }
        }

        System.out.println(L);
    }

    static class Trio {
        int P;
        int M;
        int G;

        Trio(int position, int level, int increaseAmount) {
            P = position;
            M = level;
            G = increaseAmount;
        }
    }
}