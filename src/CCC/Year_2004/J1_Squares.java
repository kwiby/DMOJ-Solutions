package CCC.Year_2004;

import java.io.*;

public class J1_Squares {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The largest square has side length " + (int) Math.sqrt(Integer.parseInt(user.readLine())) + ".");
    }
}
