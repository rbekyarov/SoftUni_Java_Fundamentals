package FU35_ExamPrep;

import java.util.*;

public class p03_Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<Integer>> cityData = new LinkedHashMap<>();

        while (!input.equals("Sail")) {
            String[] arr = input.split("\\|\\|");
            String nameCity = arr[0];
            int population = Integer.parseInt(arr[1]);
            int gold = Integer.parseInt(arr[2]);
            List<Integer> dataList = new ArrayList<>();
            if (!cityData.containsKey(nameCity)) {
                dataList.add(population);
                dataList.add(gold);
                cityData.put(nameCity, dataList);
            } else {
                int currentPopulation = cityData.get(nameCity).get(0);
                int currentGold = cityData.get(nameCity).get(1);
                dataList.add(population + currentPopulation);
                dataList.add(gold + currentGold);
                cityData.put(nameCity, dataList);
            }

            input = scanner.nextLine();
        }
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("End")) {
            String[] arrCommand = inputLine.split("=>");
            String commandName = arrCommand[0];
            String town = arrCommand[1];
            switch (commandName) {

                case "Plunder":
                    int killedPeople = Integer.parseInt(arrCommand[2]);
                    int stolenGold = Integer.parseInt(arrCommand[3]);
                    List<Integer> dataList = new ArrayList<>();
                    if (cityData.containsKey(town)) {
                        int currentPeople = cityData.get(town).get(0);
                        int currentGold = cityData.get(town).get(1);
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, stolenGold, killedPeople);
                        if (currentPeople - killedPeople <= 0 || currentGold - stolenGold <= 0) {
                            cityData.remove(town);
                            System.out.printf("%s has been wiped off the map!%n", town);
                        } else {

                            dataList.add(currentPeople - killedPeople);
                            dataList.add(currentGold - stolenGold);
                            cityData.put(town, dataList);

                        }
                    }
                    break;
                case "Prosper":
                    int goldProsper = Integer.parseInt(arrCommand[2]);
                    if (goldProsper < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        List<Integer> dataList1 = new ArrayList<>();
                        if (cityData.containsKey(town)) {
                            int currentGold = cityData.get(town).get(0);
                            dataList1.add(currentGold + goldProsper);
                            cityData.put(town, dataList1);
                            System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", goldProsper, town, currentGold + goldProsper);
                        }
                    }

                    break;
            }
            inputLine = scanner.nextLine();
        }
        System.out.printf("");
    }
}
