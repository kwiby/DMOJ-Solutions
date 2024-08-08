package CCC.Year_2023;

import java.util.Scanner;

public class S1_Trianglane {
    public static void main(String[] args) {
        test();
        /*
        Scanner user = new Scanner(System.in);
        int C = user.nextInt();
        user.nextLine();

        int tapeLength = 0;

        String [][] laneways = new String[2][C];
        for (int i = 0; i < 2; i++) {
            String values = user.nextLine();
            values = values.replaceAll(" ", "");
            for (int j = 0; j < C; j++) {
                laneways[i][j] = values.substring(0, 1);
                if (laneways[i][j].equals(Integer.toString(1))) {
                    tapeLength += 3;
                }
                values = values.substring(1);
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < C; j++) {
                try {
                    if (laneways[i][j].equals(Integer.toString(1)) && laneways[i][j + 1].equals(Integer.toString(1))) {
                        tapeLength -= 2;
                    }
                } catch (Exception e) {}
                if ((laneways[i][j].equals(Integer.toString(1))) && (i == 0) && (j % 2 == 0)) {
                    if (laneways[i + 1][j].equals(Integer.toString(1))) {
                        tapeLength -= 2;
                    }
                }
            }
        }
        System.out.println(tapeLength);*/
    }

    public static void test() {
        Scanner user = new Scanner(System.in);

        int tapeLength = 0;

        int C = user.nextInt();

        int [] laneway1 = new int[C];
        int [] laneway2 = new int[C];

        for (int i = 0; i < C; i++) {
            laneway1[i] = user.nextInt();
            if (laneway1[i] == 1) {
                tapeLength += 3;
            }
        }
        for (int i = 0; i < C; i++) {
            laneway2[i] = user.nextInt();
            if (laneway2[i] == 1) {
                tapeLength += 3;
            }
        }

        for (int i = 0; i < C; i++) {
            try {
                if (laneway1[i] == 1 && laneway1[i + 1] == 1) {
                    tapeLength -= 2;
                }
            } catch (Exception e) {}
            try {
                if (laneway2[i] == 1 && laneway2[i + 1] == 1) {
                    tapeLength -= 2;
                }
            } catch (Exception e) {}
            if ((laneway1[i] == 1) && (i % 2 == 0) && (laneway2[i] == 1)) {
                tapeLength -= 2;
            }
        }
        System.out.println(tapeLength);
    }
}
