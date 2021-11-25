package FU35_ExamPrep;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p03_The_Pianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countComposer = Integer.parseInt(scanner.nextLine());
        Map<String, String> pieceComposer = new TreeMap<>();
        Map<String, String> pieceKey = new TreeMap<>();
        for (int i = 0; i < countComposer; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String piece = input[0];
            String composer = input[1];
            String key = input[2];
            pieceComposer.putIfAbsent(piece, composer);
            pieceKey.putIfAbsent(piece, key);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String currentCommand = command.split("\\|")[0];
            String piece = command.split("\\|")[1];
            switch (currentCommand) {
                case "Add":
                    String composer = command.split("\\|")[2];
                    String key = command.split("\\|")[3];
                    if (!pieceComposer.containsKey(piece)) {
                        pieceComposer.put(piece, composer);
                        pieceKey.put(piece, key);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    } else {
                        System.out.printf("%s is already in the collection!%n", piece);
                    }
                    break;
                case "Remove":
                    if (pieceComposer.containsKey(piece)) {
                        pieceComposer.remove(piece);
                        pieceKey.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                case "ChangeKey":
                    String newKey = command.split("\\|")[2];
                    if (pieceComposer.containsKey(piece)) {
                        pieceKey.replace(piece, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, String> entryComposer : pieceComposer.entrySet()) {
            for (Map.Entry<String, String> entryKey : pieceKey.entrySet()) {
                if (entryComposer.getKey().equals(entryKey.getKey())) {
                    System.out.printf("%s -> Composer: %s, Key: %s%n", entryComposer.getKey(),entryComposer.getValue(),entryKey.getValue());
                }
            }
        }
    }
}
