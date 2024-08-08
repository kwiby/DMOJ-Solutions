package CCC.Year_2018;

import java.util.Scanner;

public class S2_Sunflowers {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int size = user.nextInt();
        int[][] table = new int[size][size];

        int smallestData = Integer.MAX_VALUE;
        int smallestDataPosX = 0;
        int smallestDataPosY = 0;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                table[row][col] = user.nextInt();
                if (table[row][col] < smallestData) {
                    smallestData = table[row][col];
                    smallestDataPosX = col;
                    smallestDataPosY = row;
                }
            }
        }

        if (smallestDataPosX == 0 && smallestDataPosY == 0) {
            printTable(table);
        }
        else if (smallestDataPosX == 0 && smallestDataPosY == size - 1) {
            printTable(rotateTable(table, 1));
        }
        else if (smallestDataPosX == size - 1 && smallestDataPosY == size - 1) {
            printTable(rotateTable(table, 2));
        }
        else if (smallestDataPosX == size - 1 && smallestDataPosY == 0) {
            printTable(rotateTable(table, 3));
        }
    }

    public static int[][] rotateTable(int[][] alteredTable, int numOfRotates) {  // --> 90 degrees rotations
        int[][] originalTable = new int[alteredTable.length][alteredTable.length];

        for (int i = 0; i < numOfRotates; i++) {
            for (int row = 0; row < originalTable.length; row++) {
                for (int col = 0; col < originalTable.length; col++) {
                    originalTable[col][originalTable.length - 1 - row] = alteredTable[row][col];
                }
            }
            for (int row = 0; row < originalTable.length; row++) {
                System.arraycopy(originalTable[row], 0, alteredTable[row], 0, originalTable.length);
            }
        }
        return originalTable;
    }

    public static void printTable(int[][] arr) {
        for (int[] ints : arr) {
            for (int col = 0; col < arr.length; col++) {
                if (col != arr.length - 1) {
                    System.out.print(ints[col] + " ");
                } else {
                    System.out.print(ints[col]);
                }
            }
            System.out.println();
        }
    }
}

/*
1 2 3  >  7 4 1
4 5 6  >  8 5 2
7 8 9  >  9 6 3


- (0,0) > (0,2)
- (0,1) > (1,2)
- (0,2) > (2,2)

- (1,0) > (0,1)
- (1,1) > (1,1)
- (1,2) > (2,1)

- (2,0) > (0,0)
- (2,1) > (1,0)
- (2,2) > (2,0)
*/
