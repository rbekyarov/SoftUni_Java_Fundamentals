package FU35_ExamPrep;

import java.util.Scanner;

public class p01_Secret_Chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder concealedMessage = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Reveal")) {
            String currentCommand = command.split(":\\|:")[0];

            switch (currentCommand) {
                case "ChangeAll":
                    String oldSubstring = command.split(":\\|:")[1];
                    String newSubstring = command.split(":\\|:")[2];
                    while (concealedMessage.toString().contains(oldSubstring)) {
                        int startIndex = concealedMessage.indexOf(oldSubstring);

                        concealedMessage.replace(startIndex, startIndex + oldSubstring.length(), newSubstring);
                    }
                    System.out.println(concealedMessage);
                    break;
                case "Reverse":
                    String substring = command.split(":\\|:")[1];
                    if (concealedMessage.toString().contains(substring)) {
                        int startIndex = concealedMessage.indexOf(substring);
                        concealedMessage.delete(startIndex, startIndex + substring.length());
                        StringBuilder strAppend = new StringBuilder();
                        for (int i = substring.length() - 1; i >= 0; i--) {
                            char currentChar = substring.charAt(i);
                            strAppend.append(currentChar);
                        }
                        concealedMessage.append(strAppend);
                        System.out.println(concealedMessage);
                    } else {
                        System.out.println("error");
                    }

                    break;
                case "InsertSpace":
                    int indexSpace = Integer.parseInt(command.split(":\\|:")[1]);
                    concealedMessage.insert(indexSpace, " ");
                    System.out.println(concealedMessage);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + concealedMessage);
    }
}
