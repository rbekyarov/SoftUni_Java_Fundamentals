package FU25_Exercise_Associative_Arrays.RE;

import java.util.*;
import java.util.stream.Collectors;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> mapCar = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            List<String> listCar = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            String command = listCar.get(0);
            String userName = listCar.get(1);

            if (command.equals("register")) {
                String lpNumber = listCar.get(2);
                if (!mapCar.containsKey(userName)) {
                    mapCar.put(userName, lpNumber);
                    System.out.printf("%s registered %s successfully%n", userName, lpNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", lpNumber);
                }
            } else {
                if (!mapCar.containsKey(userName)) {
                    System.out.printf("ERROR: user %s not found%n", userName);

                } else {
                    System.out.printf("%s unregistered successfully%n", userName);
                    mapCar.remove(userName);
                }


            }
        }
        for (Map.Entry<String, String> entry : mapCar.entrySet()) {
            System.out.printf("%s => %s%n",entry.getKey(),entry.getValue());
        }

    }
}
