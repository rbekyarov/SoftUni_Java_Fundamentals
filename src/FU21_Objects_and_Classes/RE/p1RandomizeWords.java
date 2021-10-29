package FU21_Objects_and_Classes.RE;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p1RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        for (int i = 0; i <input.size() ; i++) {
            //
            int randomIndex = random.nextInt(input.size());


            input.add(input.get(randomIndex));
            input.remove(input.get(randomIndex));

        }
        for (String el : input){
            System.out.println(el);
        }

    }
}
