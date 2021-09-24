package FU09_Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class p10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        //stop: power < distance
        //continue: power >= distance
        int count = 0; //брой на poke-ве
        int firstTimePower = power; //първоначалната стойност на силата преди poke-ване
        while (power >= distance) {
            power -= distance; //1 poke
            count++;
            //проверка дали текущия power == половината от първоначалния
            if (power == firstTimePower * 0.5 && exhaustionFactor != 0) {
                power = power / exhaustionFactor; //power /= exhaustionFactor;
            }
        }

        System.out.println(power);
        System.out.println(count);

    }

}
