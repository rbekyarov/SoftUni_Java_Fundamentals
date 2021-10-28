package FU22_Exercise_Objects_and_Classes.zzzzzzzzzzzVehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Vehicle> vehicle = new ArrayList<>();
        while (!input.equals("End")) {
            String[] inputArr = input.split(" ");
            String type = inputArr[0];
            String model = inputArr[1];
            String color = inputArr[2];
            int hp = Integer.parseInt(inputArr[3]);
            Vehicle vehicleObject = new Vehicle(type, model, color, hp);
            vehicle.add(vehicleObject);

            input = scanner.nextLine();
        }
        String model = scanner.nextLine();
        while (!model.equals("Close the Catalogue")) {
            String currentModel = model;
            vehicle.stream()
                  //  .filter(Vehicle -> vehicle.getModel().equals(currentModel))
                    .forEach(Vehicle -> System.out.println(vehicle.toString()));

            model = scanner.nextLine();

        }
    }
}
