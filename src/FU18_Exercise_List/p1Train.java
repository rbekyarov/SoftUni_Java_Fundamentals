package FU18_Exercise_List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagon = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            if (command[0].equals("Add")) {
                wagon.add(Integer.parseInt(command[1]));

            } else {
                int currentPeople = (Integer.parseInt(command[0]));
                for (int i = 0; i < wagon.size(); i++) {
                    if (currentPeople + wagon.get(i) <= maxCapacity) {
                        int sum = wagon.get(i) + currentPeople;
                        wagon.set(i, sum);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < wagon.size(); i++) {
            System.out.print(wagon.get(i) + " ");

        }
    }
}

