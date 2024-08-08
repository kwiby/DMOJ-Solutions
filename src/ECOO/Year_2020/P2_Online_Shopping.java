package ECOO.Year_2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class P2_Online_Shopping {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(user.readLine());
        int numOfStores = Integer.parseInt(user.readLine());

        for (int i = 0; i < testCases; i++) {
            Map<String, TreeMap<Integer, Integer>> itemInfo = new HashMap<>();

            for (int j = 0; j < numOfStores; j++) {
                int numOfItems = Integer.parseInt(user.readLine());

                for (int k = 0; k < numOfItems; k++) {
                    StringTokenizer st = new StringTokenizer(user.readLine());
                    String itemName = st.nextToken();
                    int itemPrice = Integer.parseInt(st.nextToken());
                    int itemQuantity = Integer.parseInt(st.nextToken());
                    System.out.println("\n" + itemName + " " + itemPrice + " " + itemQuantity);

                    if (!itemInfo.containsKey(itemName)) {
                        TreeMap<Integer, Integer> itemDetails = new TreeMap<>();
                        itemDetails.put(itemPrice, itemQuantity);
                        itemInfo.put(itemName, itemDetails);
                    } else {
                        if (itemInfo.get(itemName).containsKey(itemPrice)) {
                            TreeMap<Integer, Integer> itemDetails = itemInfo.get(itemName);
                            itemDetails.put(itemPrice, itemDetails.get(itemPrice) + itemQuantity);
                        } else {
                            itemInfo.get(itemName).put(itemPrice, itemQuantity);
                        }
                    }
                }
            }

            int minCost = 0;

            int buyCount = Integer.parseInt(user.readLine());
            for (int j = 0; j < buyCount; j++) {
                StringTokenizer st = new StringTokenizer(user.readLine());

                String itemName = st.nextToken();
                int numToBuy = Integer.parseInt(st.nextToken());

                while (numToBuy > 0) {
                    TreeMap<Integer, Integer> itemDetails = itemInfo.get(itemName);
                    System.out.println("\nitemDetails = " + itemDetails);
                    System.out.println("numToBuy = " + numToBuy);

                    if (numToBuy >= itemDetails.firstEntry().getValue()) {
                        minCost += itemDetails.firstEntry().getKey() * itemDetails.firstEntry().getValue();
                        numToBuy -= itemDetails.pollFirstEntry().getValue();
                    } else {
                        minCost += itemDetails.firstEntry().getKey() * numToBuy;
                        itemDetails.put(itemDetails.firstEntry().getKey(), itemDetails.get(itemDetails.firstEntry().getKey()) - numToBuy);
                        numToBuy = 0;
                    }
                }
            }

            System.out.println(minCost);
        }
    }
}