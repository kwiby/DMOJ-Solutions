package CCC.Year_2001;

import java.io.*;

public class S2_Spirals {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int start = Integer.parseInt(user.readLine());
        int end = Integer.parseInt(user.readLine());

        int size = (int) Math.ceil(Math.sqrt(end + 1 - start));

        if (size % 2 == 0) {
            size++;
        }

        int[][] spiral = new int[size][size];

        int ogX = size / 2;
        int ogY = size / 2;

        int col = ogX;
        int row = ogY;

        spiral[row][col] = start;

        int height = 1;
        int width = 1;
        boolean direct = true; //Direction to add number -> true = down/right, false = up/left

        for (int i = start + 1; i <= end;) {
            for (int j = 0; j < height; j++) {
                if (Math.abs(row - ogY) < height && i <= end) {
                    if (direct) {
                        row++;
                    } else {
                        row--;
                    }

                    spiral[row][col] = i;
                    i++;
                }
            }
            height++;

            for (int j = 0; j < width; j++) {
                if (Math.abs(col - ogX) < width && i <= end) {
                    if (direct) {
                        col++;
                    } else {
                        col--;
                    }

                    spiral[row][col] = i;
                    i++;
                }
            }
            width++;

            direct = !direct;
        }

        for (int[] rowValue : spiral) {
            for (int colValue : rowValue) {
                if (colValue != 0) {
                    System.out.print(colValue + " ");
                }
            }
            System.out.println();
        }
    }
}
