package CCC.Year_2014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class S1_Party_Invitation {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(user.readLine());
        int m = Integer.parseInt(user.readLine());

        ArrayList<Integer> invitees = new ArrayList<>();
        for (int i = 1; i <= K; i++) {
            invitees.add(i);
        }

        for (int i = 0; i < m; i++) {
            int round = Integer.parseInt(user.readLine());

            int subtractIndexes = 0;
            int size = invitees.size();

            for (int j = -1; j < size; j += (round)) {
                if (j != -1) {
                    invitees.remove(j - subtractIndexes);
                    subtractIndexes++;
                }
            }
        }

        for (int x : invitees) {
            System.out.println(x);
        }
    }
}
