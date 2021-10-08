package FU14_Methods;

import java.util.Scanner;

public class p7RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int repeater = Integer.parseInt(scanner.nextLine());
        String result = calculateRepeatText(text,repeater);
        System.out.println(result);
    }
    private static String calculateRepeatText(String text,int repeater) {
        String result = "";
        for (int i = 0; i <repeater ; i++) {
        result=result+text;
        }
        return result;
    }
}
