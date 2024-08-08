package CCC.Year_2004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J3_Smile_with_Similes {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        String[] adjArr = new String[Integer.parseInt(user.readLine())];
        String[] nouArr = new String[Integer.parseInt(user.readLine())];

        for (int i = 0; i < adjArr.length; i++) {
            adjArr[i] = user.readLine();
        }

        for (int i = 0; i < nouArr.length; i++) {
            nouArr[i] = user.readLine();
        }

        for (int i = 0; i < adjArr.length; i++) {
            for (int j = 0; j < nouArr.length; j++) {
                System.out.println(adjArr[i] + " as " + nouArr[j]);
            }
        }
    }
}
