package FU18_Exercise_List.RE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            List<String> command = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            if (command.get(0).equals("Add")) {
                wagons.add(Integer.parseInt(command.get(1)));
            } else {
                for (int i = 0; i < wagons.size(); i++) {

                    if (Integer.parseInt(command.get(0)) + wagons.get(i) <= maxCapacity) {
                        wagons.set(i, Integer.parseInt(command.get(0)) + wagons.get(i));
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
