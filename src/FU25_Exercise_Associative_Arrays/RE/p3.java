package FU25_Exercise_Associative_Arrays.RE;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> materials = new TreeMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        Map<String, Integer> junks = new TreeMap<>();
        boolean isOver = false;
        while (!isOver) {
            String[] data = scanner.nextLine().split(" ");

            for (int i = 0; i < data.length; i += 2) {
                int quantity = Integer.parseInt(data[i]);
                String currentItem = data[i + 1].toLowerCase();

                if (currentItem.equals("shards") || currentItem.equals("fragments") || currentItem.equals("motes")) {

                    if (currentItem.equals("shards")) {
                        int currentQuantityShards = materials.get(currentItem);
                        materials.put(currentItem, quantity + currentQuantityShards);
                        if (materials.get(currentItem) >= 250) {
                            System.out.println("Shadowmourne obtained!");
                            materials.put(currentItem, materials.get(currentItem) - 250);
                            isOver = true;
                            break;
                        }

                    } else if (currentItem.equals("fragments")) {

                        int currentQuantityFragments = materials.get(currentItem);
                        materials.put(currentItem, quantity + currentQuantityFragments);
                        if (materials.get(currentItem) >= 250) {
                            System.out.println("Valanyr obtained!");
                            materials.put(currentItem, materials.get(currentItem) - 250);
                            isOver = true;
                            break;
                        }

                    } else if (currentItem.equals("motes")) {
                        int currentQuantityMotes = materials.get(currentItem);
                        materials.put(currentItem, quantity + currentQuantityMotes);
                        if (materials.get(currentItem) >= 250) {
                            System.out.println("Dragonwrath obtained!");
                            materials.put(currentItem, materials.get(currentItem) - 250);
                            isOver = true;
                            break;
                        }

                    }
                } else {
                    if (!junks.containsKey(currentItem)) {
                        junks.put(currentItem, quantity);
                    } else {
                        int currentQuantity = junks.get(currentItem);
                        junks.put(currentItem, quantity + currentQuantity);
                    }
                }
            }
        }
        materials.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

        junks.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
