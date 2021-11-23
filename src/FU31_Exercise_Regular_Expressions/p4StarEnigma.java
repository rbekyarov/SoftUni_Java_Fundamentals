package FU31_Exercise_Regular_Expressions;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p4StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> attackedPlanets = new TreeMap<>();
        Map<String, Integer> destroyedPlanets = new TreeMap<>();


        for (int i = 0; i < n; i++) {
            String cryptMessage = scanner.nextLine();
            int countLetter = 0; //[s, t, a, r]
            for (char letter : cryptMessage.toLowerCase().toCharArray()) {
                if (letter == 's' || letter == 't' || letter == 'a' || letter == 'r') {
                    countLetter++;
                }
            }
            StringBuilder decryptedMessageBuilder = new StringBuilder();
            for (char letter : cryptMessage.toCharArray()) {

                letter -= countLetter;
                decryptedMessageBuilder.append(letter);
            }
            String decryptedMessage = decryptedMessageBuilder.toString();
            String regex = "@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attack>[AD])![^@!:>-]*->(?<soldierCount>[0-9]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decryptedMessage);
            if (matcher.find()) {
                String planetName = matcher.group("planetName");
                int population = Integer.parseInt(matcher.group("population"));
                String attack = matcher.group("attack");
                int soldierCount = Integer.parseInt(matcher.group("soldierCount"));

                if (attack.equals("A")) {
                    if (!attackedPlanets.containsKey(planetName)) {
                        attackedPlanets.put(planetName, 1);
                    } else {
                        int currentAttacks = attackedPlanets.get(planetName);
                        attackedPlanets.put(planetName, 1 + currentAttacks);
                    }
                } else {
                    if (!destroyedPlanets.containsKey(planetName)) {
                        destroyedPlanets.put(planetName, 1);
                    } else {
                        int currentDestroyed = destroyedPlanets.get(planetName);
                        destroyedPlanets.put(planetName, 1 + currentDestroyed);
                    }
                }
            }
        }
        int countAttacked = 0;
        int countDestroyed = 0;
        for (Map.Entry<String, Integer> entry : attackedPlanets.entrySet()) {
            countAttacked += entry.getValue();
        }
        System.out.printf("Attacked planets: %d%n", countAttacked);
        for (Map.Entry<String, Integer> entry : attackedPlanets.entrySet()) {
            System.out.printf("-> %s%n", entry.getKey());
        }

        for (Map.Entry<String, Integer> entry : destroyedPlanets.entrySet()) {
            countDestroyed += entry.getValue();
        }
        System.out.printf("Destroyed planets: %d%n", countDestroyed);
        for (Map.Entry<String, Integer> entry : destroyedPlanets.entrySet()) {
            System.out.printf("-> %s%n", entry.getKey());
        }

    }
}
