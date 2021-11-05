package FU25_Exercise_Associative_Arrays.RE;

import java.util.*;
import java.util.stream.Collectors;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> productMap = new LinkedHashMap<>();


        String command = scanner.nextLine();
        while (!command.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!productMap.containsKey(command)){
                productMap.put(command,quantity);
            } else {
                int currentQuantity = productMap.get(command);
                productMap.put(command,quantity+currentQuantity);
            }

            command = scanner.nextLine();

        }
        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.printf("%s -> %s%n",entry.getKey(),entry.getValue());
        }

    }
}
