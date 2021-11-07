package FU25_Exercise_Associative_Arrays.RE;

import java.util.*;

public class p8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> mapList = new TreeMap<>();
        while (!input.equals("End")) {
            String[] data = input.split(" -> ");
            if (mapList.containsKey(data[0])) {
                List<String> employees = mapList.get(data[0]);
                if (!employees.contains(data[1]))
                    employees.add(data[1]);
            } else {
                List<String> employees = new ArrayList<>();
                employees.add(data[1]);
                mapList.put(data[0], employees);
            }
            input = scanner.nextLine();
        }
        System.out.println();

        for (Map.Entry<String, List<String>> entry : mapList.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().forEach(employee -> System.out.println("-- " + employee));
        }

    }
}
