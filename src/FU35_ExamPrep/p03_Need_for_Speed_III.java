/*
Problem 3 - Need for Speed
        You have just bought the latest and greatest computer game – Need for Seed III. Pick your favorite cars and drive them all you want! We know that you can't wait to start playing.
        On the first line of the standard input, you will receive an integer n – the number of cars that you can obtain. On the next n lines, the cars themselves will follow with their mileage and fuel available, separated by "|" in the following format:
        "{car}|{mileage}|{fuel}"
        Then, you will be receiving different commands, each on a new line, separated by " : ", until the "Stop" command is given:
        •	"Drive : {car} : {distance} : {fuel}":
        o	You need to drive the given distance, and you will need the given fuel to do that. If the car doesn't have enough fuel, print: "Not enough fuel to make that ride"
        o	If the car has the required fuel available in the tank, increase its mileage with the given distance, decrease its fuel with the given fuel, and print:
        "{car} driven for {distance} kilometers. {fuel} liters of fuel consumed."
        o	You like driving new cars only, so if a car's mileage reaches 100 000 km, remove it from the collection(s) and print: "Time to sell the {car}!"
        •	"Refuel : {car} : {fuel}":
        o	Refill the tank of your car.
        o	Each tank can hold a maximum of 75 liters of fuel, so if the given amount of fuel is more than you can fit in the tank, take only what is required to fill it up.
        o	Print a message in the following format: "{car} refueled with {fuel} liters"
        •	"Revert : {car} : {kilometers}":
        o	Decrease the mileage of the given car with the given kilometers and print the kilometers you have decreased it with in the following format:
        "{car} mileage decreased by {amount reverted} kilometers"
        o	If the mileage becomes less than 10 000km after it is decreased, just set it to 10 000km and
        DO NOT print anything.
        Upon receiving the "Stop" command, you need to print all cars in your possession, sorted by their mileage in descending order, then by their name in ascending order, in the following format:
        "{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt."
        Input/Constraints
        •	The mileage and fuel of the cars will be valid, 32-bit integers, and will never be negative.
        •	The fuel and distance amounts in the commands will never be negative.
        •	The car names in the commands will always be valid cars in your possession.
        Output
        •	All the output messages with the appropriate formats are described in the problem description.
*/

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

