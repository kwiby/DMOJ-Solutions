package CCC.Year_2011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1_Which_Alien {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(user.readLine());
        int b = Integer.parseInt(user.readLine());

        if (a >= 3 && b <= 4) {
            System.out.println("TroyMartian");
        } if (a <= 6 && b >= 2) {
            System.out.println("VladSaturnian");
        } if (a <= 2 && b <= 3) {
            System.out.println("GraemeMercurian");
        }
    }
}
