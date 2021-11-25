/*
Problem 1 - World Tour
        Problem for exam preparation for the Programming Fundamentals Course @SoftUni.
        Submit your solutions in the SoftUni judge system at https://judge.softuni.org/Contests/Practice/Index/2518#0.

        You are a world traveler, and your next goal is to make a world tour. To do that, you have to plan out everything first. To start with, you would like to plan out all of your stops where you will have a break.
        On the first line, you will be given a string containing all of your stops. Until you receive the command "Travel", you will be given some commands to manipulate that initial string. The commands can be:
        •	"Add Stop:{index}:{string}":
        o	Insert the given string at that index only if the index is valid
        •	"Remove Stop:{start_index}:{end_index}":
        o	Remove the elements of the string from the starting index to the end index (inclusive) if both indices are valid
        •	"Switch:{old_string}:{new_string}":
        o	If the old string is in the initial string, replace it with the new one (all occurrences)
        Note: After each command, print the current state of the string
        After the "Travel" command, print the following: "Ready for world tour! Planned stops: {string}"
        Input / Constraints
        •	JavaScript: you will receive a list of strings
        •	An index is valid if it is between the first and the last element index (inclusive) in the sequence.
        Output
        •	Print the proper output messages in the proper cases as described in the problem description
*/

        package FU35_ExamPrep;

import java.util.Scanner;

public class p01_World_Tour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stops = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Travel")) {
            String currentCommand = command.split(":")[0];
            switch (currentCommand) {
                case "Add Stop":
                    int indexStop = Integer.parseInt(command.split(":")[1]);
                    String newStops = command.split(":")[2];
                    if (indexStop >= 0 && indexStop <= stops.length() - 1) {
                        stops.insert(indexStop, newStops);

                    }
                    System.out.println(stops);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(command.split(":")[1]);
                    int endIndex = Integer.parseInt(command.split(":")[2]);
                    if (startIndex >= 0 && endIndex <= stops.length() - 1) {
                        stops.delete(startIndex, endIndex + 1);

                    }
                    System.out.println(stops);
                    break;
                case "Switch":
                    String oldString = command.split(":")[1];
                    String newString = command.split(":")[2];
                    if(stops.toString().contains(oldString)){
                        String text = stops.toString();
                        text = text.replaceAll(oldString,newString);
                       stops.replace(0,text.length(),text);
                    }
                    System.out.println(stops);
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s%n",stops);

    }
}
