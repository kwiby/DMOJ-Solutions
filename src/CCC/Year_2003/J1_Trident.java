package CCC.Year_2003;

import java.io.*;

public class J1_Trident {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int height = Integer.parseInt(user.readLine());
        int spacing = Integer.parseInt(user.readLine());
        int length = Integer.parseInt(user.readLine());

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("*");
                for (int k = 0; k < spacing; k++) {
                    System.out.print(" ");
                }
            }
            System.out.print("*\n");
        }

        for (int i = 0; i < 3 + spacing * 2; i++) {
            System.out.print("*");
        }

        for (int i = 0; i < length; i++) {
            System.out.println();
            for (int j = 0; j < 1 + spacing; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }

        System.out.println();
    }
}
