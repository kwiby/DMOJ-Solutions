package CCC.Year_2008;

import java.util.Scanner;

public class S1_Its_Cold_Here {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int coldestTemp = Integer.MAX_VALUE;
        String coldestCity = "";
        String input = "";

        while (!(input.startsWith("Waterloo"))) {
            input = user.nextLine();

            for (int i = input.length(); i > 0; i--) {
                if (input.charAt(i - 1) == ' ') {
                    if (Integer.parseInt(input.substring(i)) < coldestTemp) {
                        coldestTemp = Integer.parseInt(input.substring(i));
                        coldestCity = input.substring(0, i - 1);
                    }
                }
            }
        }

        System.out.println(coldestCity);
    }
}