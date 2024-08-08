package CCC.Year_2002;

import java.io.*;

public class J1_0123456789 {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(user.readLine());

        switch (num) {
            case 0:
                System.out.print(" * * *\n*     *\n*     *\n*     *\n\n*     *\n*     *\n*     *\n * * *\n");
                break;
            case 1:
                System.out.print("\n      *\n      *\n      *\n\n      *\n      *\n      *\n\n");
                break;
            case 2:
                System.out.print(" * * *\n      *\n      *\n      *\n * * *\n*\n*\n*\n * * *\n");
                break;
            case 3:
                System.out.print(" * * *\n      *\n      *\n      *\n * * *\n      *\n      *\n      *\n * * *\n");
                break;
            case 4:
                System.out.print("\n*     *\n*     *\n*     *\n * * *\n      *\n      *\n      *\n\n");
                break;
            case 5:
                System.out.print(" * * *\n*\n*\n*\n * * *\n      *\n      *\n      *\n * * *\n");
                break;
            case 6:
                System.out.print(" * * *\n*\n*\n*\n * * *\n*     *\n*     *\n*     *\n * * *\n");
                break;
            case 7:
                System.out.print(" * * *\n      *\n      *\n      *\n\n      *\n      *\n      *\n\n");
                break;
            case 8:
                System.out.print(" * * *\n*     *\n*     *\n*     *\n * * *\n*     *\n*     *\n*     *\n * * *\n");
                break;
            case 9:
                System.out.print(" * * *\n*     *\n*     *\n*     *\n * * *\n      *\n      *\n      *\n * * *\n");
                break;
        }
    }
}
