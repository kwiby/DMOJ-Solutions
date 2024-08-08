package CCC.Year_2016;

import java.util.Scanner;

public class S1_Ragaman {
    public static void main(String[] args) {
        System.out.println(code());
    }

    public static String code() {
        Scanner user = new Scanner(System.in);

        String line1 = user.nextLine();
        String line2 = user.nextLine();

        for (char c : line1.toCharArray()) {
            if (line2.indexOf(c) != -1) {
                line2 = line2.substring(0, line2.indexOf(c)) + line2.substring(line2.indexOf(c) + 1);
            } else if (line2.contains("*")) {
                line2 = line2.substring(0, line2.indexOf("*")) + line2.substring(line2.indexOf("*") + 1);
            } else {
                return "N";
            }
        } return "A";
    }

}
