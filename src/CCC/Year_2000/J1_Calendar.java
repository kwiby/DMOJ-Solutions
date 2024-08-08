package CCC.Year_2000;

import java.util.Scanner;

public class J1_Calendar {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int startDay = user.nextInt();
        int days = user.nextInt();

        int colNum = startDay - 1;

        System.out.println("Sun Mon Tue Wed Thr Fri Sat");
        for (int i = 1; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= days; i++) {
            if (i / 10 == 0) {
                System.out.print("  " + i);
            } else {
                System.out.print(" " + i);
            }

            if (colNum < 6 && i < days) {
                System.out.print(" ");
            }

            colNum++;

            if (colNum == 7) {
                colNum = 0;
                System.out.println();
            }
        }
    }
}