package FU35_ExamPrep;

import java.util.Scanner;

public class p01_Activation_Keys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder activationKey = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Generate")) {
            String[] commandArr = command.split(">>>");
            String commandName = commandArr[0];

            switch (commandName) {
                case "Contains":
                    String substring = commandArr[1];
                    if (activationKey.toString().contains(substring)) {
                        System.out.printf("%s contains %s%n", activationKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String subCommand = commandArr[1];
                    int startIndex = Integer.parseInt(commandArr[2]);
                    int endIndex = Integer.parseInt(commandArr[3]);
                    String substr = activationKey.substring(startIndex, endIndex);
                    if (subCommand.equals("Upper")) {
                        String theUpperString = substr.toUpperCase();
                        activationKey.replace(startIndex, endIndex, theUpperString);
                    } else {
                        String theLowerString = substr.toLowerCase();
                        activationKey.replace(startIndex, endIndex, theLowerString);
                    }
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    int firstIndex = Integer.parseInt(commandArr[1]);
                    int lastIndex = Integer.parseInt(commandArr[2]);
                    activationKey.delete(firstIndex, lastIndex);
                    System.out.println(activationKey);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", activationKey);
    }
}
