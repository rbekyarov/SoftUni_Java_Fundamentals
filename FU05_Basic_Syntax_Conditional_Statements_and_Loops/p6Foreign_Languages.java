package SoftUni_Java_Fundamentals.FU05_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class p6Foreign_Languages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cuntry = scanner.nextLine();

        if(cuntry.equals("USA") || cuntry.equals("England")){
            System.out.println("English");
        }else if(cuntry.equals("Spain") || cuntry.equals("Argentina")|| cuntry.equals("Mexico")){
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }


    }
}
