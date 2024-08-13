package CCC.Year_2007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S2_Boxes {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, List<Integer>> boxSizes = new TreeMap<>();

        int n = Integer.parseInt(user.readLine()); // # of different sizes of boxes.
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            int length = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            List<Integer> dimensions = Arrays.asList(length, width, height);
            Collections.sort(dimensions);

            boxSizes.put(length * width * height, dimensions);
        }

        int m = Integer.parseInt(user.readLine()); // # of items to be packaged.
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(user.readLine());
            int length1 = Integer.parseInt(st.nextToken());
            int width1 = Integer.parseInt(st.nextToken());
            int height1 = Integer.parseInt(st.nextToken());

            int volume1 = length1 * width1 * height1;

            Integer[] volumes = boxSizes.keySet().toArray(new Integer[0]);
            int index = -1;
            for (int j = 0; j < n; j++) {
                if (volumes[j] >= volume1) {
                    index = j;
                    break;
                }
            }

            if (index != -1) {
                for (int j = index; j < boxSizes.size(); j++) {
                    int length2 = boxSizes.get(volumes[j]).get(0);
                    int width2 = boxSizes.get(volumes[j]).get(1);
                    int height2 = boxSizes.get(volumes[j]).get(2);

                    int[] dimensions = {length1, width1, height1};
                    Arrays.sort(dimensions);

                    if ((dimensions[0] <= length2) && (dimensions[1] <= width2) && (dimensions[2] <= height2)) {
                        System.out.println(volumes[j]);
                        break;
                    } else if (j == boxSizes.size() - 1) {
                        System.out.println("Item does not fit.");
                    }
                }
            } else {
                System.out.println("Item does not fit.");
            }
        }
    }
}
