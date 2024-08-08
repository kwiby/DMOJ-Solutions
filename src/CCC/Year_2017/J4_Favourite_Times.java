package CCC.Year_2017;

import java.util.Scanner;

public class J4_Favourite_Times {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        final int SEQUENCE_COUNT = 31; //Number of arithmetic sequences there are between 12:00 AM to 11:59 PM.
        final int MINUTES_IN_HALF_DAY = 720; //Number of minutes in 12 hours.

        int duration = user.nextInt();

        int hours = 12;
        int mins = 0;

        int favTimes = duration / MINUTES_IN_HALF_DAY * SEQUENCE_COUNT;

        int diff;

        for (int i = 0; i <= duration % MINUTES_IN_HALF_DAY; i++, mins++) {
            if (mins > 59) {
                mins = 0;
                hours++;
                if (hours > 12) {
                    hours -= 12;
                }
            }

            if (hours > 9) {
                diff = hours / 10 - hours % 10;
                if ((hours % 10 - mins / 10 == diff) && (mins / 10 - mins % 10 == diff)) {
                    favTimes++;
                }
            } else {
                diff = hours - mins / 10;
                if (mins / 10 - mins % 10 == diff) {
                    favTimes++;
                }
            }
        }

        System.out.println(favTimes);
    }
}