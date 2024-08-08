package Other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Unique_Elements {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(user.readLine());
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(user.readLine()));
        }
        System.out.println(list.size());
    }
}
