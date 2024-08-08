package CCC.Year_2002;

import java.io.*;

public class J2_AmeriCanadian {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        String input = user.readLine();
        while (!input.equals("quit!")) {
            char c = input.charAt(input.length() - 3);
            if ((input.endsWith("or")) && (input.length() >= 4) && (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y')) {
                System.out.println(input.substring(0, input.length() - 2) + "our");
            } else {
                System.out.println(input);
            }
            input = user.readLine();
        }
    }
}
