package FU18_Exercise_List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p2ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Delete":
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) == Integer.parseInt(command[1])) {
                            list.remove(i + 0);
                        }
                    }
                    break;
                case "Insert":
                    list.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
