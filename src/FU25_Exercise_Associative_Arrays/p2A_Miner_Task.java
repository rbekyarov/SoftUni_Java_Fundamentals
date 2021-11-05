package FU25_Exercise_Associative_Arrays;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p2A_Miner_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> table = new LinkedHashMap<>();
        int sum = 0;

        while (!input.equals("stop")) {

            String currentKey = input;
            int valueMap = Integer.parseInt(scanner.nextLine());

            if (!table.containsKey(currentKey)) {
                table.put(currentKey, valueMap);
            } else {
                sum = table.get(currentKey) + valueMap;
                table.put(currentKey, sum);

            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
