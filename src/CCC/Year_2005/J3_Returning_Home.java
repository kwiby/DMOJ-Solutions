package CCC.Year_2005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class J3_Returning_Home {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> instructions = new ArrayList<>();

        while (true) {
            if (instructions.isEmpty()) {
                String direction = user.readLine();
                if (direction.equals("L")) {
                    instructions.add("Turn RIGHT into your HOME.");
                } else {
                    instructions.add("Turn LEFT into your HOME.");
                }
            } else {
                String location = user.readLine();
                if (location.equals("SCHOOL")) {
                    break;
                }

                String direction = user.readLine();

                if (direction.equals("L")) {
                    instructions.add("Turn RIGHT onto " + location + " street.");
                } else {
                    instructions.add("Turn LEFT onto " + location + " street.");
                }
            }
        }

        for (int i = instructions.size() - 1; i >= 0; i--) {
            System.out.println(instructions.get(i));
        }
    }
}
