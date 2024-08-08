package CCC.Year_2022;

import java.util.Scanner;

public class J3_Harp_Tuning {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        String instructions = user.next();
        instructions = instructions.replaceAll("\\+", " tighten ").replaceAll("-", " loosen ");

        int startIndex = 0;
        for (int i = 0; i < instructions.length(); i++) {
            if (i == instructions.length() - 1 || Character.isDigit(instructions.charAt(i)) && Character.isAlphabetic(instructions.charAt(i + 1))) {
                System.out.println(instructions.substring(startIndex, i + 1));
                startIndex = i + 1;
            }
        }
    }
}