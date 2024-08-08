package VM7WC.Year_2016;
//3
import java.util.Scanner;

public class Silver_GG {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        String str = user.next();
        int[] psa = new int[str.length()];

        if (str.charAt(0) == 'G') {
            psa[0] = 1;
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == 'G') {
                psa[i] = psa[i - 1] + 1;
            } else {
                psa[i] = psa[i - 1];
            }
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