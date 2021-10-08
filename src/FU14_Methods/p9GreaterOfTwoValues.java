package FU14_Methods;

import java.util.Scanner;

public class p9GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        switch (type) {
            case "int":
                int num1 = Integer.parseInt(a);
                int num2 = Integer.parseInt(b);
                int result = getMax(num1, num2);
                System.out.println(result);
                break;
            case "char":
                char letter1 = a.charAt(0);
                char letter2 = b.charAt(0);
                char letter3 = getMax(letter1, letter2);
                System.out.println(letter3);
                break;
            case "string":
                String text = getMax(a, b);
                System.out.println(text);
                break;
        }
    }

    private static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    private static char getMax(char letter1, char letter2) {
        if (letter1 > letter2) {
            return letter1;
        } else {
            return letter2;
        }
    }

    private static String getMax(String a, String b) {
        //if (a.length() > b.length()) {
        if(a.compareTo(b)>0){// сравняване дължината на два стринга
            return a;
        } else {
            return b;
        }

    }
}
