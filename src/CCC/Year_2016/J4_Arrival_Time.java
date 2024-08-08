package CCC.Year_2016;

import java.util.Scanner;

public class J4_Arrival_Time {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        String startTime = user.nextLine();
        int time = Integer.parseInt(startTime.substring(0, 2)) * 60 + Integer.parseInt(startTime.substring(3)); //Time in minutes

        for (int i = 0; i < 120; i += 10) {
            if (time >= 420 && time < 600) {
                time += 20;
            } else if (time >= 900 && time < 1140) {
                time += 20;
            } else {
                time += 10;
            }
        }

        System.out.printf("%02d:%02d", time / 60 % 24, time % 60);
    }
}