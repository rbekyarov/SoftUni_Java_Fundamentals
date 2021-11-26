package FU35_ExamPrep;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p03_Need_for_Speed_III {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numsCar = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> carMileage = new TreeMap<>();
        Map<String, Integer> carFuel = new TreeMap<>();
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
                        }
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;

                case "Refuel":
                    int refuel = Integer.parseInt(command.split(" : ")[2]);
                    int currentFuel = carMileage.get(carModel);
                    if (refuel + currentFuel < 70) {
                        carFuel.put(carModel, refuel + currentFuel);
                    } else {
                        carFuel.put(carModel, 70);
                    }
                    System.out.printf("%s refueled with %d liters%n", carModel, refuel);
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
        System.out.println();


    }
}
