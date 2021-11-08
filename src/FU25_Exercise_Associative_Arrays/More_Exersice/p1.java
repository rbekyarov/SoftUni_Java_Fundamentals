package FU25_Exercise_Associative_Arrays.More_Exersice;

import java.util.*;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> allContests = new HashMap<>();
        Map<String, Map<String, Integer>> users = new TreeMap<>();

        while (!input.equals("end of contests")) {
            String[] arr = input.split(":");
            String contest = arr[0];
            String password = arr[1];

            allContests.putIfAbsent(contest, password);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("end of submissions")) {
            String[] arr = input.split("=>");
            String contest = arr[0];
            String password = arr[1];
            String username = arr[2];
            int points = Integer.parseInt(arr[3]);

            if (allContests.containsKey(contest)) {
                if (allContests.get(contest).equals(password)) {
                    Map<String, Integer> course = new LinkedHashMap<>();
                    course.put(contest, points);

                    if (!users.containsKey(username)) {
                        users.put(username, course);
                    } else {
                        if (!users.get(username).containsKey(contest)) {
                            users.get(username).put(contest, points);
                        } else {
                            users.get(username).put(contest, Math.max(points, users.get(username).get(contest)));
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        int bestSum = 0;
        for (Map.Entry<String, Map<String, Integer>> user : users.entrySet()) {
            int sum = user.getValue().values().stream().mapToInt(i -> i).sum();
            if (sum >= bestSum) {
                bestSum = sum;
            }
        }
        for (Map.Entry<String, Map<String, Integer>> user : users.entrySet()) {
            if (user.getValue().values().stream().mapToInt(i -> i).sum() == bestSum) {
                System.out.printf("Best candidate is %s with total %s points.%n", user.getKey(), bestSum);
            }
        }
        System.out.println("Ranking:");
        users.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.entrySet()
                    .stream()
                    .sorted((f, s) -> s.getValue().compareTo(f.getValue()))
                    .forEach(e -> System.out.printf("#  %s -> %d%n", e.getKey(), e.getValue()));
        });
    }
}
