package UACC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1_Bench_Press_Bob {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        if ((Integer.parseInt(user.readLine()) - 45) % 90 == 0) {
            System.out.println("Let's go Bob!");
        } else {
            System.out.println("Rip Bob!");
        }
    }
}
