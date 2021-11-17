package FINAL_EXAM;

import java.util.*;

public class p3PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantMap = new LinkedHashMap<>();
        Map<String, List<Double>> plantsRating = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("<->");
            if (!plantMap.containsKey(input[0])) {
                plantMap.put(input[0], Integer.parseInt(input[1]));
            } else {
                plantMap.put(input[0], Integer.parseInt(input[1]));
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String[] arr = command.split("[:\\s+\\-?][\\s+]");
            String commandCase = arr[0];
            String plant = arr[1].trim();

            switch (commandCase) {

                case "Rate":
                    double rating = Double.parseDouble(arr[2]);
                    List<Double> ratings = new ArrayList<>();
                    if (!plantsRating.containsKey(plant)) {
                        ratings.add(rating);
                        plantsRating.put(plant, ratings);
                    } else if (plantsRating.containsKey(plant)) {
                        plantsRating.get(plant).add(rating);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    rating = Double.parseDouble(arr[2]);
                    plantMap.put(plant, (int) (rating));
                    break;
                case "Reset":
                    if (plantsRating.get(plant) != null) {
                        plantsRating.get(plant).clear();
                    } else {
                        System.out.println("error");
                    }

                    break;
                default:
                    System.out.println("error");

            }
            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantMap.entrySet()
                .stream()
                .sorted((f, s) -> {
                    int result = s.getValue().compareTo(f.getValue());
                    if (result == 0) {
                        double firstPlantAverageRating = plantsRating.get(f.getKey()).stream().mapToDouble(x -> x).average().orElse(0);
                        double secondPlantAverageRating = plantsRating.get(s.getKey()).stream().mapToDouble(x -> x).average().orElse(0);
                        result = Double.compare(secondPlantAverageRating, firstPlantAverageRating);
                    }
                    return result;
                }).forEach(e -> {
                    double averageRating = plantsRating.get(e.getKey()).stream().mapToDouble(x -> x).average().orElse(0);
                    System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", e.getKey(), e.getValue(), averageRating);
                });
    }
}