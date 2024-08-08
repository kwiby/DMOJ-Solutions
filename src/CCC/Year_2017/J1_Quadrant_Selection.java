package CCC.Year_2017;

import java.io.*;

public class J1_Quadrant_Selection {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(user.readLine());
        int y = Integer.parseInt(user.readLine());

        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}
