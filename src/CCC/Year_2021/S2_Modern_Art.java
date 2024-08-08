package CCC.Year_2021;

import java.util.Scanner;

public class S2_Modern_Art {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int numOfGolds = 0;

        int [] r = new int[user.nextInt()];
        int [] c = new int[user.nextInt()];

        int K = user.nextInt();

        user.nextLine();

        for (int i = 0; i < K; i++) {
            String temp = user.nextLine();
            if (temp.charAt(0) == 'R') {
                r[Integer.parseInt(temp.substring(2)) - 1]++;
            } else {
                c[Integer.parseInt(temp.substring(2)) - 1]++;
            }
        }

        for (int rIndex : r) {
            for (int cIndex : c) {
                if ((rIndex + cIndex) % 2 != 0) {
                    numOfGolds++;
                }
            }
        }

        System.out.println(numOfGolds);
    }
}
