package CCC.Year_2024;

import java.io.*;

public class S1_Hat_Circle {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        /*int N = Integer.parseInt(user.readLine());

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(user.readLine());
        }

        int count = 0;
        for (int i = 0; i < N / 2; i++) {
            if (nums[i] == nums[i + N / 2]) {
                count += 2;
            }
        }*/

        int n = Integer.parseInt(user.readLine()) / 2;

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(user.readLine());
        }

        int count = 0;
        for (int i = n; i < n * 2; i++) {
            if (Integer.parseInt(user.readLine()) == nums[i - n]) {
                count += 2;
            }
        }

        /*
        int N = Integer.parseInt(user.readLine());

        int[] nums = new int[N / 2];

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (i < N / 2) {
                nums[i] = Integer.parseInt(user.readLine());
            } else if (Integer.parseInt(user.readLine()) == nums[i - N / 2]) {
                count += 2;
            }
        }
        */

        System.out.println(count);
    }
}
