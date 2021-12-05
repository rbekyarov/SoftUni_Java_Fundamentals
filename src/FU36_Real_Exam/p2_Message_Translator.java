package FU36_Real_Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p2_Message_Translator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String regex = "!(?<commandName>[A-Z][a-z]{3,})!:\\[(?<operation>[A-za-z]{8,})\\]";
        Pattern pattern = Pattern.compile(regex);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String inputLine = scan.nextLine();
            Matcher matcher = pattern.matcher(inputLine);
            if (matcher.find()) {
                String commandName = matcher.group("commandName");
                String operation = matcher.group("operation");
                for (int j = 0; j < operation.length(); j++) {
                    char symbol = operation.charAt(j);
                    sb.append((int) symbol).append(" ");
                }
                System.out.printf("%s: ", commandName);
                System.out.println(sb);
            } else {
                System.out.println("The message is invalid");
            }
        }
    }
}

