package CCC.Year_2000;

import java.io.*;

public class S1_Slot_Machines {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int plays = 0;
        int numQuarters = Integer.parseInt(user.readLine());

        int firstUsage = Integer.parseInt(user.readLine());
        int secondUsage = Integer.parseInt(user.readLine());
        int thirdUsage = Integer.parseInt(user.readLine());

        while (numQuarters > 0) {
            plays++;
            firstUsage++;
            numQuarters--;
            if (firstUsage % 35 == 0) {
                numQuarters += 30;
            }
            if (numQuarters == 0) break;

            plays++;
            secondUsage++;
            numQuarters--;
            if (secondUsage % 100 == 0) {
                numQuarters += 60;
            }
            if (numQuarters == 0) break;

            plays++;
            thirdUsage++;
            numQuarters--;
            if (thirdUsage % 10 == 0) {
                numQuarters += 9;
            }
            if (numQuarters == 0) break;
        }

        System.out.println("Martha plays " + plays + " times before going broke.");
    }
}