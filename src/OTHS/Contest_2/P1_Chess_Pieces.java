package OTHS.Contest_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1_Chess_Pieces {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        String s = user.readLine();
        switch (s) {
            case "queen" -> System.out.println(9);
            case "rook" -> System.out.println(5);
            case "bishop", "knight" -> System.out.println(3);
            case "pawn" -> System.out.println(1);
            default -> System.out.println("priceless");
        }
    }
}
