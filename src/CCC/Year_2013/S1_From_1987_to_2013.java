package CCC.Year_2013;

import java.util.HashSet;
import java.util.Scanner;

public class S1_From_1987_to_2013 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int year = user.nextInt() + 1;

        while (true) {
            int digits = Integer.toString(year).length();
            HashSet<Integer> uniqueCheck = new HashSet<>();
            for (int i = 0; i < digits; i++) {
                uniqueCheck.add(year / (int) Math.pow(10, digits - 1 - i) % 10);
            }

            if (uniqueCheck.size() != digits) {
                boolean[] unique = new boolean[10];
                for (int i = 0; i < digits; i++) { //For each digit in the year.
                    int pow1 = (int) Math.pow(10, digits - 1 - i);
                    int iNum = year / pow1 % 10; //Gets digit on index i of year.

                    if (unique[iNum]) { //Checking if boolean value for iNum is true (meaning not unique).
                        year = year / pow1 * pow1; //Sets all numbers to the right of iNum to 0.
                        while (unique[iNum]) { //While iNum is not unique.
                            year += pow1; //Adds one to the digit on index i of year.
                            iNum = year / pow1 % 10; //Sets iNum to the new value (year += pow1)
                            if (!unique[iNum]) { //Checking if the new value is a unique value.
                                unique[iNum] = true; //If the new value is unique, set boolean value to true.
                                break; //Breaks out of while loop after getting new value.
                            }
                        }
                    } else {
                        unique[iNum] = true;
                    }
                }
            } else {
                break;
            }
        }
        System.out.println(year);
    }
}