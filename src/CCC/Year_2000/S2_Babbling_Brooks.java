package CCC.Year_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class S2_Babbling_Brooks {
    public static void main(String[] args) throws IOException  {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(user.readLine());
        LinkedList<Double> flow = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            flow.add(Double.parseDouble(user.readLine()));
        }

        int in = Integer.parseInt(user.readLine());
        while (in != 77) {
            int m = Integer.parseInt(user.readLine()) - 1;

            if (in == 99) {
                double P = Double.parseDouble(user.readLine()) / 100;
                double temp = flow.get(m);
                flow.set(m, P * temp);
                flow.add(m + 1, (1 - P) * temp);
            } else if (in == 88) {
                flow.set(m, flow.get(m) + flow.get(m + 1));
                flow.remove(m + 1);
            }

            in = Integer.parseInt(user.readLine());
        }

        for (double x : flow) {
            System.out.print(Math.round(x) + " ");
        }
    }
}
