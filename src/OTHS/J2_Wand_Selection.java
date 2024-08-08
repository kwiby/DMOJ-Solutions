package OTHS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J2_Wand_Selection {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int[] data = new int[Integer.parseInt(user.readLine())];

        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(user.readLine());
        }

        Arrays.sort(data);

        int sum = 0;
        for (int i = 0; i < data.length - 1; i++) {
            sum += data[i];
        }

        System.out.println(sum / (data.length - 1));
    }
}
