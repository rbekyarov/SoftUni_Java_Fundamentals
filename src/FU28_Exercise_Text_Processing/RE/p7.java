package FU28_Exercise_Text_Processing.RE;

import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //abv>1>1>2>2asdasd
        StringBuilder text = new StringBuilder(input);
        int strength = 0; //колко ми е силата на атаката
        for (int index = 0; index < text.length(); index++) {
            char currentSymbol = text.charAt(index);
            if (currentSymbol == '>') {
                strength += Integer.parseInt("" + text.charAt(index + 1));
            } else if (currentSymbol != '>' && strength > 0){
                text.deleteCharAt(index);
                strength--;
                index--;
            }
        }
        System.out.println(text);
    }
}
