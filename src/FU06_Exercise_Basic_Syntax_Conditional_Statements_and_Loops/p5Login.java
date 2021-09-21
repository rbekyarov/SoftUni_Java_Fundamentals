package FU06_Exercise_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class p5Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        String input = scanner.nextLine();
        String pass = "";
        int count = 0;

        for (int i = user.length() - 1; i >= 0; i--) {

            pass += user.charAt(i) + "";

            //Може и така:
            // char currentSymbol = user.charAt(i);
            // pass +=currentSymbol;
        }
        while (true) {
            if (pass.equals(input)) {
                System.out.printf("User %s logged in.", user);
                break;
            } else {
                count++;
                if (count == 4){
                    System.out.printf("User %s blocked!",user);
                    break;
                }
                System.out.println("Incorrect password. Try again.");
                input = scanner.nextLine();
            }
        }
    }
}
