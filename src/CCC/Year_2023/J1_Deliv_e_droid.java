package CCC.Year_2023;

import java.util.Scanner;

public class J1_Deliv_e_droid {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int numOfPackages = user.nextInt();
        int numOfCollisions = user.nextInt();

        int score = numOfPackages * 50 - numOfCollisions * 10;

        if (numOfPackages > numOfCollisions) {
            score += 500;
        }
        System.out.println(score);
    }
}