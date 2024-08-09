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

        for (int i = 0; i < testCases; i++) {
            Map<String, TreeMap<Integer, Integer>> itemInfo = new HashMap<>();
            int numOfStores = Integer.parseInt(user.readLine());

            for (int j = 0; j < numOfStores; j++) {
                int numOfItems = Integer.parseInt(user.readLine());

                for (int k = 0; k < numOfItems; k++) {
                    StringTokenizer st = new StringTokenizer(user.readLine());
                    String itemName = st.nextToken();
                    int itemPrice = Integer.parseInt(st.nextToken());
                    int itemQuantity = Integer.parseInt(st.nextToken());

                    if (!itemInfo.containsKey(itemName)) { // If there is already an item with the same name in the map.
                        TreeMap<Integer, Integer> itemDetails = new TreeMap<>();
                        itemDetails.put(itemPrice, itemQuantity);
                        itemInfo.put(itemName, itemDetails);
                    } else {
                        if (itemInfo.get(itemName).containsKey(itemPrice)) { // If there is already an item with the same price in the treemap.
                            itemInfo.get(itemName).put(itemPrice, itemInfo.get(itemName).get(itemPrice) + itemQuantity);
                        } else { // If there isn't already an item with the same price in the treemap.
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

                    if (numToBuy >= itemDetails.firstEntry().getValue()) { // If the # of items to buy is greater than or equal to the quantity of the item at a specific price.
                        minCost += itemDetails.firstEntry().getKey() * itemDetails.firstEntry().getValue();
                        numToBuy -= itemDetails.pollFirstEntry().getValue();
                    } else { // If the # of items to buy is less than the quantity of the item at a specific price.
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