package CCC.Year_2005;

import java.util.Scanner;

public class S1_Snow_Calls {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int t = user.nextInt();

        user.nextLine();
        String phoneNum;

        for (int i = 0; i < t; i++) {
            phoneNum = user.nextLine().replaceAll("-", "").replaceAll("[ABC]", "2").replaceAll("[DEF]", "3")
                    .replaceAll("[GHI]", "4").replaceAll("[JKL]", "5").replaceAll("[MNO]", "6")
                    .replaceAll("[PQRS]", "7").replaceAll("[TUV]", "8").replaceAll("[WXYZ]", "9");
            System.out.println(phoneNum.substring(0, 3) + "-" + phoneNum.substring(3, 6) + "-" + phoneNum.substring(6, 10));
        }
    }
}