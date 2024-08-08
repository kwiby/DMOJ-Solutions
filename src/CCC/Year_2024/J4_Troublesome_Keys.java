package CCC.Year_2024;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class J4_Troublesome_Keys {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        String aStr = user.readLine();
        String bStr = user.readLine();

        Set<Character> aSet = new HashSet<>();
        for (char x : aStr.toCharArray()) {
            aSet.add(x);
        }
        Set<Character> tempSet = new HashSet<>(aSet);

        Set<Character> bSet = new HashSet<>();
        for (char x : bStr.toCharArray()) {
            bSet.add(x);
        }

        for (char x : bSet) {
            aSet.remove(x);
        }
        for (char x : tempSet) {
            bSet.remove(x);
        }

        Iterator<Character> it = aSet.iterator();
        Character a1 = it.next();
        Character b1 = bSet.iterator().next();

        if (aSet.size() == 1) {
            System.out.println(a1 + " " + b1);
            System.out.println('-');
        }  else {
            Character a2 = it.next();

            if (aStr.replace(a1, b1).replaceAll(String.valueOf(a2), "").equals(bStr)) {
                System.out.println(a1 + " " + b1);
                System.out.println(a2);
            } else {
                System.out.println(a2 + " " + b1);
                System.out.println(a1);
            }
        }
    }
}