package FU18_Exercise_List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p4ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Add":
                    list.add(Integer.parseInt(command[1]));
                    break;
                case "Remove":
                    if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[1]) <= list.size()) {
                        list.remove(list.get(Integer.parseInt(command[1])));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Insert":
                    if (Integer.parseInt(command[2]) >= 0 && Integer.parseInt(command[2]) <= list.size()) {
                        list.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    if (command[1].equals("left")) {
                        for (int i = 0; i < Integer.parseInt(command[2]); i++) {
                            list.add(list.get(0));
                            list.remove(0);
                        }
                    } else {
                        for (int i = 0; i < Integer.parseInt(command[2]); i++) {
                            int lastIndex = list.get(list.size() - 1);
                            list.add(0, lastIndex);
                            list.remove(list.size() - 1);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
