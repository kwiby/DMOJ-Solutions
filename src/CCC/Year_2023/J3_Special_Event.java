package CCC.Year_2023;

import java.util.Scanner;

public class J3_Special_Event {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int numOfInterested = user.nextInt();
        int[] days = new int[5];

        user.nextLine();

        for (int i = 0; i < numOfInterested; i++) {
            String availibility = user.nextLine();
            for (int j = 0; j < 5; j++) {
                if (availibility.charAt(j) == 'Y') {
                    days[j]++;
                }
            }
        }

        int mostPeople = 0;

        for (int i = 0; i < 5; i++) {
            if (days[i] > mostPeople) {
                mostPeople = days[i];
            }
        }
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (days[i] == mostPeople) {
                count++;
                if (count == 1) {
                    System.out.print(i + 1);
                } else {
                    System.out.print("," + (i + 1));
                }
            }
        }
    }
}