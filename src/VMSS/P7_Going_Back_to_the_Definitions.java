package VMSS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P7_Going_Back_to_the_Definitions {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(user.readLine());
        String[] nums = new String[N];

        for (int i = 0; i < N; i++) {
            nums[i] = user.readLine();
        }

        Arrays.sort(nums, (x, y) -> (y + x).compareTo(x + y));

        for (String x : nums) {
            System.out.print(x);
        }
    }
}
