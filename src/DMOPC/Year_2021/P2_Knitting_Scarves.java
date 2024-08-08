package DMOPC.Year_2021; // Create CUSTOM (not inbuilt one) Doubly-Linked List!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P2_Knitting_Scarves {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(user.readLine());

        int N = Integer.parseInt(st.nextToken());
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int Q = Integer.parseInt(st.nextToken());
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(user.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int iL = list.indexOf(L);
            int iR = list.indexOf(R);
            int iK = list.indexOf(K);

            if (iK < iL) {
                int count = 1;
                for (int j = iL; j <= iR; j++) {
                    int temp = list.remove(j);
                    list.add(iK + count, temp);
                    count++;
                }
            } else {
                for (int j = 0; j <= iR - iL; j++) {
                    int temp = list.remove(iL);
                    list.add(iK, temp);
                }
            }
        }

        for (int x : list) {
            System.out.print(x + " ");
        }
    }
}