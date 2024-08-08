package CCC.Year_2001;

import java.io.*;

public class S1_Keeping_Score {
    static int totalScore = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        String info = user.readLine();

        String clubs = info.substring(info.indexOf('C') + 1, info.indexOf('D'));
        String diamonds = info.substring(info.indexOf('D') + 1, info.indexOf('H'));
        String hearts = info.substring(info.indexOf('H') + 1, info.indexOf('S'));
        String spades = info.substring(info.indexOf('S') + 1);

        System.out.println("Cards Dealt  Points");
        System.out.print("Clubs ");
        printData(clubs);
        System.out.println("  " + infoAnalyze(clubs));
        System.out.print("Diamonds ");
        printData(diamonds);
        System.out.println("  " + infoAnalyze(diamonds));
        System.out.print("Hearts ");
        printData(hearts);
        System.out.println("  " + infoAnalyze(hearts));
        System.out.print("Spades ");
        printData(spades);
        System.out.println("  " + infoAnalyze(spades));
        System.out.println(" Total  " + totalScore);
    }

    public static int infoAnalyze(String str) {
        int count = 0;

        if (str.isEmpty()) {
            count += 3;
        } else if (str.length() == 1) {
            count += 2;
        } else if (str.length() == 2) {
            count++ ;
        }

        for (char c : str.toCharArray()) {
            switch (c) {
                case 'A':
                    count += 4;
                    break;
                case 'K':
                    count += 3;
                    break;
                case 'Q':
                    count += 2;
                    break;
                case 'J':
                    count += 1;
                    break;
            }
        }

        totalScore += count;
        return count;
    }

    public static void printData(String str) {
        for (char c : str.toCharArray()) {
            if (c != '1' && c != '0') {
                System.out.print(" " + c);
            } else if (c == '1') {
                System.out.print(" 1");
            } else {
                System.out.print("0");
            }
        }
    }
}
