package CCC.Year_2003;

import java.io.*;

public class S1_Snakes_and_ladders {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int spot = 1;

        while (true) {
            int input = Integer.parseInt(user.readLine());

            switch (spot + input) {
                case 9:
                    spot = 34;
                    break;
                case 40:
                    spot = 64;
                    break;
                case 54:
                    spot = 19;
                    break;
                case 67:
                    spot = 86;
                    break;
                case 90:
                    spot = 48;
                    break;
                case 99:
                    spot = 77;
                    break;
                default:
                    if (spot + input < 100) {
                        spot += input;
                    } else if (spot + input == 100) {
                        System.out.println("You are now on square 100");
                        System.out.println("You Win!");
                        input = 101;
                    }
                    break;
            }

            if (input == 0) {
                System.out.println("You Quit!");
                break;
            } else if (input == 101) {
                break;
            } else {
                System.out.println("You are now on square " + spot);
            }
        }
    }
}
