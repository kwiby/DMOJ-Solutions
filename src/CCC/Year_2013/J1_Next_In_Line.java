package CCC.Year_2013;

import java.util.Scanner;

public class J1_Next_In_Line {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int a = user.nextInt();
        int b = user.nextInt();
        System.out.println(b + (b - a));
    }
}