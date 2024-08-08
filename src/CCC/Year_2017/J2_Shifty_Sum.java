package CCC.Year_2017;

import java.io.*;

public class J2_Shifty_Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(recursion(Integer.parseInt(user.readLine()), Integer.parseInt(user.readLine())));
    }

    public static int recursion(int N, int k) {
        if (k >= 0) {
            return (int) (N * Math.pow(10, k) + recursion(N, k - 1));
        }
        return 0;
    }
}
