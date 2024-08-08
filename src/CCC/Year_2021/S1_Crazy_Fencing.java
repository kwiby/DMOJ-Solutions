package CCC.Year_2021;

import java.util.Scanner;

public class S1_Crazy_Fencing {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int N = user.nextInt();

        user.nextLine();

        String [] heights = user.nextLine().split(" ");
        String [] widths = user.nextLine().split(" ");

        double totalArea = 0;

        for (int i = 0; i < widths.length; i++) {
            totalArea += (double) (Integer.parseInt(heights[i]) + Integer.parseInt(heights[i + 1])) / 2 * Integer.parseInt(widths[i]);
        }

        System.out.println(totalArea);
    }
}
