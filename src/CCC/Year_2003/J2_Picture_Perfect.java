package CCC.Year_2003;

import java.io.*;

public class J2_Picture_Perfect {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(user.readLine());

        while (input != 0) {
            int dim1 = (int) Math.sqrt(input);
            while (input % dim1 != 0) {
                dim1--;
            }
            int dim2 = input / dim1;

            int perimeter = dim1 * 2 + dim2 * 2;

            System.out.println("Minimum perimeter is " + perimeter + " with dimensions " + dim1 + " x " + dim2);

            input = Integer.parseInt(user.readLine());
        }
    }
}
