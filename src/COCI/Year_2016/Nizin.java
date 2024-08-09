package COCI.Year_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Nizin {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int numOfMoves = 0;

        int N = Integer.parseInt(user.readLine());
        Deque<Integer> A = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(user.readLine());
        for (int i = 0; i < N; i++) {
            A.addLast(Integer.parseInt(st.nextToken()));
        }

        while (!A.isEmpty()) {
            int L = A.getFirst();
            int R = A.getLast();

            if (L == R) {
                A.pollFirst();
                A.pollLast();
            } else if (L < R) {
                numOfMoves++;
                A.addFirst(A.removeFirst() + A.removeFirst());
            } else {
                numOfMoves++;
                A.addLast(A.removeLast() + A.removeLast());
            }
        }

        System.out.println(numOfMoves);
    }
}
