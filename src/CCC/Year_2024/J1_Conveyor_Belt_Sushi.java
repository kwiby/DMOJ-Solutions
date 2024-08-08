package CCC.Year_2024;

import java.io.*;

public class J1_Conveyor_Belt_Sushi {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int R = Integer.parseInt(user.readLine());
        int G = Integer.parseInt(user.readLine());
        int B = Integer.parseInt(user.readLine());

        System.out.println(R * 3 + G * 4 + B * 5);
    }
}
