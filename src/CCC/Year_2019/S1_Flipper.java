package CCC.Year_2019;

import java.util.Scanner;

public class S1_Flipper {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int verticleFlips = 0;
        int horizontalFlips = 0;

        String sequence = user.nextLine();

        for (char c : sequence.toCharArray()) {
            if (c == 'V') {
                verticleFlips++;
            } else {
                horizontalFlips++;
            }
        }

        if (verticleFlips % 2 == 0 && horizontalFlips % 2 == 0) {
            System.out.println("1 2\n3 4");
        } else if (verticleFlips % 2 == 0) {
            System.out.println("3 4\n1 2");
        } else if (horizontalFlips % 2 == 0) {
            System.out.println("2 1\n4 3");
        } else {
            System.out.println("4 3\n2 1");
        }
    }
}