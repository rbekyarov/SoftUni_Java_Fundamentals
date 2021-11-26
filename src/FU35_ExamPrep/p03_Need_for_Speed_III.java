package FU35_ExamPrep;

import java.util.*;

public class p03_Need_for_Speed_III {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numsCar = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> carMileage =
                new TreeMap<String, Integer>(Collections.reverseOrder());
        Map<String, Integer> carFuel =
                new TreeMap<String, Integer>(Collections.reverseOrder());
        for (int i = 0; i < numsCar; i++) {
            String input = scanner.nextLine();
            String carModel = input.split("\\|")[0];
            int mileage = Integer.parseInt(input.split("\\|")[1]);
            int fuel = Integer.parseInt(input.split("\\|")[2]);
            carMileage.putIfAbsent(carModel, mileage);
            carFuel.putIfAbsent(carModel, fuel);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String currentCommand = command.split(" : ")[0];
            String carModel = command.split(" : ")[1];
            switch (currentCommand) {
                case "Drive":
                    int distance = Integer.parseInt(command.split(" : ")[2]);
                    int fuel = Integer.parseInt(command.split(" : ")[3]);
                    int realFuel = carFuel.get(carModel);
                    int currentMileage = carMileage.get(carModel);
                    if (realFuel > fuel) {
                        carFuel.put(carModel, realFuel - fuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carModel, distance, fuel);
                        if (distance + currentMileage < 100000) {
                            carMileage.put(carModel, distance + currentMileage);
                        } else {
                            carMileage.remove(carModel);
                            carFuel.remove(carModel);
                            System.out.printf("Time to sell the %s!%n", carModel);
                        }
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;

                case "Refuel":
                    int refuel = Integer.parseInt(command.split(" : ")[2]);
                    int currentFuel = carFuel.get(carModel);
                    if (refuel + currentFuel < 75) {
                        carFuel.put(carModel, refuel + currentFuel);
                        System.out.printf("%s refueled with %d liters%n", carModel, refuel);
                    } else {
                        carFuel.put(carModel, 75);
                        System.out.printf("%s refueled with %d liters%n", carModel, 75 - currentFuel);
                    }

                    break;
                case "Revert":
                    int revertKilometers = Integer.parseInt(command.split(" : ")[2]);
                    int currentKilometers = carMileage.get(carModel);
                    if (currentKilometers - revertKilometers > 10000) {
                        carMileage.put(carModel, currentKilometers - revertKilometers);
                        System.out.printf("%s mileage decreased by %d kilometers%n", carModel, revertKilometers);
                    } else {
                        carMileage.put(carModel, 10000);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        carMileage.entrySet().stream()
                .sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue()))
                .forEach(s -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", s.getKey(), s.getValue(), returnValue(s.getKey().toString(), carFuel)));
    }

    private static int returnValue(String carModel, Map<String, Integer> carFuel) {
        int valueOfKey = 0;
        for (Map.Entry<String, Integer> entry : carFuel.entrySet()) {
            if (carModel.equals(entry.getKey())) {
                valueOfKey = entry.getValue();
            }
        }

        return valueOfKey;
    }
}

