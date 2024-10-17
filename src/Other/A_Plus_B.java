package Other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Plus_B {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(user.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        }
    }
}