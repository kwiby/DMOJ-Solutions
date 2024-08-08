package CCC.Year_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class J5_Harvest_Waterloo {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;

        int R = Integer.parseInt(user.readLine());
        int C = Integer.parseInt(user.readLine());

        char[][] patch = new char[R][C];


        for (int row = 0; row < R; row++) {
            String str = user.readLine();
            for (int col = 0; col < C; col++) {
                patch[row][col] = str.charAt(col);
            }
        }

        int startR = Integer.parseInt(user.readLine());
        int startC = Integer.parseInt(user.readLine());

        boolean[][] visited = new boolean[R][C];
        Queue<int[]> q = new LinkedList<>();

        visited[startR][startC] = true;
        q.add(new int[] {startR, startC});

        while (!q.isEmpty()) {
            int[] check = q.poll();
            int currentR = check[0];
            int currentC = check[1];

            if (patch[currentR][currentC] == 'S') {
                total++;
            } else if (patch[currentR][currentC] == 'M') {
                total += 5;
            } else if (patch[currentR][currentC] == 'L') {
                total += 10;
            }

            int[][] dir = {{1, -1, 0, 0}, {0, 0, 1, -1}};
            for (int i = 0; i < 4; i++) {
                int newR = currentR + dir[0][i];
                int newC = currentC + dir[1][i];

                if (newR >= 0 && newR < R && newC >= 0 && newC < C && patch[newR][newC] != '*' && !visited[newR][newC]) {
                    visited[newR][newC] = true;
                    q.add(new int[] {newR, newC});
                }
            }
        }

        System.out.println(total);
    }
}
