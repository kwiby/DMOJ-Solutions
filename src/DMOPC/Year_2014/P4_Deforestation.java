package DMOPC.Year_2014;

import java.util.Scanner;

public class P4_Deforestation {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int treesInLine = user.nextInt();

        int[] masses = new int[treesInLine];
        for (int i = 0; i < treesInLine; i++) {
            masses[i] = user.nextInt();
        }

        int[] psa = new int[treesInLine];
        psa[0] = masses[0];
        for (int i = 1; i < treesInLine; i++) {
            psa[i] = psa[i - 1] + masses[i];
        }

        int numQ = user.nextInt();
        for (int i = 0; i < numQ; i++) {
            int L = user.nextInt(); int R = user.nextInt();

            if (L == 0) {
                System.out.println(psa[R]);
            } else {
                System.out.println(psa[R] - psa[L - 1]);
            }
        }
    }
}