package CCC.Year_2018;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class S1_Voronoi_Villages {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int numOfVillages = user.nextInt();

        int [] villagesPos = new int[numOfVillages];

        for (int i = 0; i < numOfVillages; i++) {
            villagesPos[i] = user.nextInt();
        }

        Arrays.sort(villagesPos);

        double smallestSize = Double.MAX_VALUE;

        for (int i = 0; i < villagesPos.length; i++) {
            if (i != 0 && i != villagesPos.length - 1) {
                double temp = (villagesPos[i] - (double) (villagesPos[i] + villagesPos[i - 1]) / 2) + ((double) (villagesPos[i] + villagesPos[i + 1]) / 2 - villagesPos[i]);
                if (temp < smallestSize) {
                    smallestSize = temp;
                }
            }
        }
        System.out.println(new DecimalFormat("0.0").format(smallestSize));
    }
}