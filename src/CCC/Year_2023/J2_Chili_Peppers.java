package CCC.Year_2023;

import java.util.HashMap;
import java.util.Scanner;

public class J2_Chili_Peppers {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        HashMap<String, Integer> SHUvalues = new HashMap<String, Integer>();

        SHUvalues.put("Poblano", 1_500);
        SHUvalues.put("Mirasol", 6_000);
        SHUvalues.put("Serrano", 15_500);
        SHUvalues.put("Cayenne", 40_000);
        SHUvalues.put("Thai", 75_000);
        SHUvalues.put("Habanero", 125_000);

        int spiciness = 0;

        int numOfPeppers = user.nextInt();

        user.nextLine();

        for (int i = 0; i < numOfPeppers; i++) {
            spiciness += SHUvalues.get(user.nextLine());
        }

        System.out.println(spiciness);
    }
}
