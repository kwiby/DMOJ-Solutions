package CCC.Year_2023;

import java.io.*;
import java.util.StringTokenizer;

public class S2_Symmetric_Mountains {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int numOfMountains = Integer.parseInt(user.readLine());
        int[] heights = new int[numOfMountains];
        int[] asymmetricValues = new int[numOfMountains];

        StringTokenizer st = new StringTokenizer(user.readLine());
        for (int i = 0; i < numOfMountains; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }

        int numOfLoops = 1;
        int sum = 0;
        for (int i = 0; i < numOfMountains; i++) {
            asymmetricValues[i] = Integer.MAX_VALUE;
            if (i % 2 == 0 && i != 0) {
                numOfLoops++;
            }
            for (int j = 0; j < numOfMountains - i; j++) {
                sum = 0;
                for (int k = 0; k < numOfLoops; k++) {
                    sum += Math.abs(heights[j + k] - heights[j + i - k]);
                }
                if (sum < asymmetricValues[i]) {
                    asymmetricValues[i] = sum;
                }
            }
        }
        for (int num : asymmetricValues) {
            System.out.print(num + " ");
        }
    }
}