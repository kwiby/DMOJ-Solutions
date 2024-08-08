package CCC.Year_2022;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class J5_Square_Pool {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(user.readLine());
        int numOfTrees = Integer.parseInt(user.readLine());

        HashMap<Integer, Integer> coords = new HashMap<>();

        for (int i = 0; i < numOfTrees; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            coords.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        int bestSize = 0;

        String[][] grid = new String[size][size];

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (coords.containsKey(col) && coords.get(col) == row) {
                    grid[row][col] = "\uD83C\uDF33";
                } else {
                    grid[row][col] = "⬛";
                }
            }
        }

        for (String[] row : grid) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println(bestSize);
    }
}
