package FU27_Text_Processing.RE;


import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String result = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                result += input.charAt(i);

            }
            System.out.printf("%s = %s%n", input, result);

            input = scanner.nextLine();
        }
    }
}

