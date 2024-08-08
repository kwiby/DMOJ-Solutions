package CCC.Year_2014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1_Triangle_Times {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(user.readLine()), b = Integer.parseInt(user.readLine()), c = Integer.parseInt(user.readLine());

        if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a + b + c == 180) {
            if (a != b && a != c && b != c) {
                System.out.println("Scalene");
            } else {
                System.out.println("Isosceles");
            }
        } else {
            System.out.println("Error");
        }
    }
}
