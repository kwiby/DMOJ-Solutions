package CCC.Year_2001;

import java.io.*;

public class J1_Dressing_Up {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(user.readLine());

        int count = 1;

        boolean add = true;

        for (int i = 0; i < size; i++) {
            if (i == size / 2) {
                add = false;
            }
            for (int j = 0; j < size * 2; j++) {
                if (i == size / 2) {
                    System.out.print("*");
                } else if (j < count || j >= size * 2 - count) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

            if (add) {
                count += 2;
            } else {
                count -= 2;
            }
        }
    }
}
