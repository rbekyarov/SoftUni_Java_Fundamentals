package FU35_ExamPrep;

import java.util.Scanner;

public class p01Password_Reset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Done")) {

            String[] currentCommand = command.split(" ");
            String commandName = currentCommand[0];
            switch (commandName) {
                case "TakeOdd":
                    StringBuilder concat = new StringBuilder();
                    for (int i = 0; i < sb.length(); i++) {
                        if (i % 2 == 1) {
                            char currentSymbol = sb.charAt(i);
                            concat.append(currentSymbol);
                        }
                    }
                    System.out.println(concat);
                    sb = concat;
                    break;
                case "Cut":
                    int index = Integer.parseInt(currentCommand[1]);
                    int length = Integer.parseInt(currentCommand[2]);
                    sb.replace(index, index + length, "");
                    System.out.println(sb);
                    break;

                case "Substitute":
                    String oldString = currentCommand[1];
                    String newString = currentCommand[2];
                    if (sb.toString().contains(oldString)) {
                        while (sb.toString().contains(oldString)) {
                            int startIndex = sb.indexOf(oldString);
                            sb.replace(startIndex, startIndex + oldString.length(), newString);
                        }
                        System.out.println(sb);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + sb);
    }
}
