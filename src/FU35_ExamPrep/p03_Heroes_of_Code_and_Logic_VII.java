package FU35_ExamPrep;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p03_Heroes_of_Code_and_Logic_VII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> heroHIT = new TreeMap<>();
        Map<String, Integer> heroMana = new TreeMap<>();

        int countHeroes = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countHeroes; i++) {
            String input = scanner.nextLine();
            String[] dataArr = input.split(" ");
            String heroName = dataArr[0];
            int hitPoints = Integer.parseInt(dataArr[1]);
            int manaPoints = Integer.parseInt(dataArr[2]);
            heroHIT.putIfAbsent(heroName, hitPoints);
            heroMana.putIfAbsent(heroName, manaPoints);
        }
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] currentCommandArr = command.split(" - ");
            String commandName = currentCommandArr[0];
            String heroName = currentCommandArr[1];
            switch (commandName) {
                case "Heal":
                    int healRecovered = Integer.parseInt(currentCommandArr[2]);
                    int currentHeal = heroHIT.get(heroName);
                    if (healRecovered + currentHeal > 100) {
                        heroHIT.put(heroName, 100);
                        System.out.printf("%s healed for %d HP!%n", heroName, 100 - currentHeal);
                    } else {
                        heroHIT.put(heroName, healRecovered + heroHIT.get(heroName));
                        System.out.printf("%s healed for %d HP!%n", heroName, healRecovered);
                    }
                    break;
                case "Recharge":
                    int manaRecharge = Integer.parseInt(currentCommandArr[2]);
                    int currentMana = heroMana.get(heroName);
                    if (manaRecharge + currentMana > 200) {
                        heroMana.put(heroName, 200);
                        System.out.printf("%s recharged for %d MP!%n", heroName, 200 - currentMana);
                    } else {
                        heroMana.put(heroName, manaRecharge + heroMana.get(heroName));
                        System.out.printf("%s recharged for %d MP!%n", heroName, manaRecharge);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(currentCommandArr[2]);
                    String attacker = currentCommandArr[3];
                    int currentHP = heroHIT.get(heroName);
                    if (currentHP - damage < 1) {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroHIT.remove(heroName);
                    } else {
                        int resultHP = currentHP - damage;
                        heroHIT.put(heroName, resultHP);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, resultHP);
                    }
                    break;
                case "CastSpell":
                    int needMP = Integer.parseInt(currentCommandArr[2]);
                    String spellName = currentCommandArr[3];
                    if (heroMana.get(heroName) >= needMP) {
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, heroMana.get(heroName) - needMP);
                        heroMana.put(heroName, heroMana.get(heroName) - needMP);

                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        heroHIT.entrySet().stream()
                .sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue()))
                .forEach(e -> {
                    System.out.println(e.getKey());
                    System.out.println("  HP: " + e.getValue());
                    System.out.println("  MP: " + heroMana.get(e.getKey()));
                });
    }
}