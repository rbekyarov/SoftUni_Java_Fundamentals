package FU31_Exercise_Regular_Expressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class p2Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nameList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String nameRegex = "[A-Za-z]";
        String distanceRegex = "[0-9]";

        StringBuilder sbNamePlayer = new StringBuilder();
        String command = scanner.nextLine();
        Pattern patternName = Pattern.compile(nameRegex);
        Pattern patternDistance = Pattern.compile(distanceRegex);
        Map<String, Integer> players = new LinkedHashMap<>();
        int totalDistance = 0;
        while (!command.equals("end of race")) {
            Matcher matcherName = patternName.matcher(command);
            Matcher matcherDistance = patternDistance.matcher(command);

            while (matcherName.find()) {
                sbNamePlayer.append(matcherName.group());
            }
            if (nameList.contains(sbNamePlayer.toString())) {
                if (!players.containsKey(sbNamePlayer.toString())) {
                    while (matcherDistance.find()) {
                        int distance = Integer.parseInt(matcherDistance.group());
                        totalDistance += distance;
                    }
                    players.put(sbNamePlayer.toString(), totalDistance);
                } else {
                    int currentDistance = players.get(sbNamePlayer.toString());
                    while (matcherDistance.find()) {
                        int distance = Integer.parseInt(matcherDistance.group());
                        totalDistance += distance;
                    }
                    players.put(sbNamePlayer.toString(), totalDistance + currentDistance);
                }

            }
            command = scanner.nextLine();
            sbNamePlayer = new StringBuilder();//нулираме на билдера
            totalDistance = 0; // нулиране на дистанцията

        }
        List<String> nameFinalPlayer = new ArrayList<>();
        players.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).limit(3)
                .forEach(e -> {
                    nameFinalPlayer.add(e.getKey());
                });
        for (int i = 0; i <nameFinalPlayer.size() ; i++) {
            String str = "";
            if(i==0){
                str = "st";
            }else if (i==1){
                str = "nd";
            } else {
                str = "rd";
            }
            System.out.printf("%d%s place: %s%n",i+1,str,nameFinalPlayer.get(i));
        }

    }
}