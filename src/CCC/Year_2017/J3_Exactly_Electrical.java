package CCC.Year_2017;

import java.io.*;
import java.util.StringTokenizer;

public class J3_Exactly_Electrical {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(user.readLine());
        int startX = Integer.parseInt(st.nextToken());
        int startY = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(user.readLine());
        int endX = Integer.parseInt(st.nextToken());
        int endY = Integer.parseInt(st.nextToken());

        int charge = Integer.parseInt(user.readLine());

        int distance = Math.abs(endX - startX) + Math.abs(endY - startY);

        if ((charge >= distance) && (distance % 2 == 0 && charge % 2 == 0 || distance % 2 != 0 && charge % 2 != 0)) {
            System.out.println('Y');
        } else {
            System.out.println('N');
        }
    }
}
