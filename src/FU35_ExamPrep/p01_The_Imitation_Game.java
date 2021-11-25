package FU35_ExamPrep;

import java.util.Scanner;

public class p01_The_Imitation_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder cryptMassage = new StringBuilder(scanner.nextLine());
        StringBuilder decryptMassage = new StringBuilder();

        String command = scanner.nextLine();
        decryptMassage.append(cryptMassage.toString());
        while (!command.equals("Decode")) {
            String currentCommand = command.split("\\|")[0];

            switch (currentCommand) {
                case "ChangeAll":
                    char letterChecker = command.split("\\|")[1].charAt(0);
                    char letterReplacement = command.split("\\|")[2].charAt(0);
                    for (int i = 0; i < cryptMassage.toString().length(); i++) {

                        if (cryptMassage.charAt(i) == letterChecker) {
                            decryptMassage.setCharAt(i, letterReplacement);
                        }
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(command.split("\\|")[1]);
                    String letter = command.split("\\|")[2];
                    // decryptMassage.setCharAt(index,letter); - замества
                    decryptMassage.insert(index, letter);//вмъква
                    break;
                case "Move":
                    int indexMove = Integer.parseInt(command.split("\\|")[1]);
                    String str = decryptMassage.substring(0, indexMove);
                    decryptMassage.replace(0, indexMove, "");
                    decryptMassage.append(str);
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", decryptMassage.toString().trim());

    }
}
