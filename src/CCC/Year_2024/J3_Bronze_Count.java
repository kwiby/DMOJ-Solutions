package CCC.Year_2024;

import java.io.*;
import java.util.Arrays;

public class J3_Bronze_Count {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(user.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(user.readLine());
        }

        Arrays.sort(arr);

        int count = 0;
        int lowest = 0;

        int a = arr[N - 1];
        int indexB = 0;

        for (int i = N - 1; i >= 0; i--) {
            if (arr[i] != a) {
                indexB = i;
                break;
            }
        }

        int b = arr[indexB];
        int indexC = 0;
        for (int i = indexB; i >= 0 ; i--) {
            if (arr[i] != b) {
                indexC = i;
                break;
            }
        }

        int c = arr[indexC];
        for (int i = indexC; i >= 0; i--) {
            if (arr[i] == c) {
                count++;
            } else {
                break;
            }
        }

        System.out.println(c + " " + count);
    }
}
