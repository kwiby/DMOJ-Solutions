package CCC.Year_2014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S3_The_Geneva_Confection {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(user.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(user.readLine());
            Stack<Integer> branch = new Stack<>();
            int num = 1;
            boolean valid = true;

            int[] inputs = new int[N];
            for (int j = N - 1; j >= 0; j--) {
                inputs[j] = Integer.parseInt(user.readLine());
            }

            for (int j = 0; j < N; j++) {
                int input = inputs[j];

                if (branch.empty()) {
                    if (input != num) {
                        branch.add(input);
                    } else {
                        num++;
                    }
                } else {
                    if (input != num && branch.peek() != num) {
                        if (input > branch.peek()) {
                            valid = false;
                            break;
                        } else {
                            branch.add(input);
                        }
                    } else if (branch.peek() == num) {
                        j--;
                        branch.pop();
                        num++;
                    } else {
                        num++;
                    }
                }
            }

            if (valid) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
