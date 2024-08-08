package CCC.Year_2004;

import java.io.*;

public class J2_Terms_of_Office {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int start = Integer.parseInt(user.readLine());
        int end = Integer.parseInt(user.readLine());

        for (int i = start; i <= end; i += 60) {
            System.out.println("All positions change in year " + i);
        }
    }
}
