package CCC.Year_2024;

import java.io.*;
import java.util.StringTokenizer;

public class S3_Swipe {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(user.readLine());

        StringTokenizer st = new StringTokenizer(user.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(user.readLine());
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        String cmds = "";
        String out = "YES";
        for (int i = 0; i < N; i++) {
            boolean goFor = true;

            if (A[i] != B[i]) {
                if (i != 0) {
                    if (B[i] == A[i - 1]) {
                        A[i] = A[i - 1];
                        count++;
                        cmds += "R " + (i - 1) + " " + i + "\n";
                        goFor = false;
                    }
                }

                if (goFor) {
                    if (i != N - 1) {
                        boolean check = false;
                        for (int j = i + 1; j < N; j++) {
                            if (B[i] == A[j]) {
                                for (int k = i; k < j + 1; k++) {
                                    A[k] = A[j];
                                }
                            } else if (j == N - 1) {
                                check = true;
                                break;//////

                            } if (j == N - 1) {//broken
                                count++;
                                cmds += "L " + i + " " + j + "\n";
                            }
                        }
                        if (check) {
                            out = "NO";
                            break;
                        }
                    } else if (i == N - 1) {
                        out = "NO";
                        break;
                    }
                }
            }
        }

        System.out.println(out);
        if (count > 0 || out.equals("YES")) System.out.println(count);
        if (!cmds.isEmpty()) System.out.println(cmds);
    }
}
