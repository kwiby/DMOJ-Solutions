package UACC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3_Cheeky_Checkers {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        String[][] board = new String[8][8];

        for (int row = 0; row < 8; row++) {
            String str = user.readLine();
            for (int col = 0; col < 8; col++) {
                board[row][col] = String.valueOf(str.charAt(col));
            }
        }


    }
}
