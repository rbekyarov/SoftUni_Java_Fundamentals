package FU21_Objects_and_Classes;

import java.util.Random;
import java.util.Scanner;

public class p1RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] textArray = text.split("\\s+");
        Random random = new Random();
        for (int i = 0; i < textArray.length ; i++) {
           int randomIndex = random.nextInt(textArray.length);
           String temp = textArray[i];
            textArray[i] = textArray[randomIndex];
            textArray[randomIndex] = temp;

        }
        for (int i = 0; i <textArray.length ; i++) {
            System.out.println(textArray[i]);

        }
    }
}
