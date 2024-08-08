package CCC.Year_2011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class J5_Unfriend {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(user.readLine());

        TreeMap<Integer, Integer> people = new TreeMap<>();
        for (int i = 1; i < N; i++) {
            people.put(i, Integer.parseInt(user.readLine()));
        }

        System.out.println(people);
        people.remove(3);
        System.out.println(people);
    }
}
