package FU20_Mid_Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String commands = scanner.nextLine();

        while (!commands.equals("Report")) {

            String[] tokens = commands.split("\\s+");
            String commandType = tokens[0];

            switch (commandType) {
                case "Blacklist":
                    blacklistNames(names, tokens[1]);
                    break;
                case "Error":
                    errorNames(names, tokens[1]);
                    break;
                case "Change":
                    changeNames(names, tokens);
                    break;
            }
            commands = scanner.nextLine();
        }
        int blacklistedNames = 0;
        int lostNames = 0;

        for (String name : names) {
            if (name.equals("Blacklisted")) {
                blacklistedNames++;
            } else if (name.equals("Lost")) {
                lostNames++;
            }
        }
        System.out.printf("Blacklisted names: %d%n", blacklistedNames);
        System.out.printf("Lost names: %d%n", lostNames);
        for (String name : names) {
            System.out.print(name + " ");
        }

    }

    private static void changeNames(List<String> names, String[] tokens) {
        int index = Integer.parseInt(tokens[1]);
        String newName = tokens[2];

        if (index >= 0 && index < names.size()) {
            String currentName = names.get(index);
            names.set(index, newName);
            System.out.printf("%s changed his username to %s.%n", currentName, newName);
        }
    }

    private static void errorNames(List<String> names, String token) {
        int index = Integer.parseInt(token);
        String username = names.get(index);
        if (username.equals("Blacklisted") || username.equals("Lost")) {

        } else {
            names.set(index, "Lost");
            System.out.printf("%s was lost due to an error.%n", username);
        }
    }

    private static void blacklistNames(List<String> names, String token) {
        if (names.contains(token)) {
            names.set(names.indexOf(token), "Blacklisted");
            System.out.printf("%s was blacklisted.%n", token);
        } else {
            System.out.printf("%s was not found.%n", token);
        }
    }
}


