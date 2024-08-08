package Other;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int [] sort = new int[user.nextInt()];

        for (int i = 0; i < sort.length; i++) {
            sort[i] = user.nextInt();
        }

        for (int i = 0; i < sort.length; i++) {
            for (int j = i + 1; j < sort.length; j++) {
                if (sort[i] > sort[j]) {
                    int temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
            }
        }
        for (int num : sort) {
            System.out.println(num);
        }
    }
}
