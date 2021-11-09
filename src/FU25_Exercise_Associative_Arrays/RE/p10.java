package FU25_Exercise_Associative_Arrays.RE;

import java.util.*;

public class p10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> userPoints = new TreeMap<>();
        Map<String, Integer> langCount = new TreeMap<>();
        while (!input.equals("exam finished")) {
            String[] data = input.split("-");
            String userName = data[0];

            if (data.length == 3) {
                String lang = data[1];
                int points = Integer.parseInt(data[2]);
                if (!userPoints.containsKey(userName)) {
                    userPoints.put(userName, points);
                } else {
                    if (langCount.containsKey(lang)) {
                        userPoints.put(userName, points);
                    } else {
                        userPoints.put(userName, userPoints.get(userName) + points);
                    }

                }
                if (!langCount.containsKey(lang)) {
                    langCount.put(lang, 1);
                } else {
                    langCount.put(lang, langCount.get(lang) + 1);
                }

            } else {
                userPoints.remove(userName);

            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        userPoints.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.printf("%s | %d%n", entry.getKey(), entry.getValue()));
        System.out.println("Submissions:");
        langCount.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.printf("%s - %d%n", entry.getKey(), entry.getValue()));
    }

}

