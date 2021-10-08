package FU14_Methods;

import java.util.Scanner;

public class p2Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        grades(grade);
    }

    private static void grades(double grade) {
        String result = "";
        if(grade>=2&&grade<3){
            result="Fail";
        }else if(grade>=3&&grade<3.5){
            result="Poor";
        }else if(grade>=3.5&&grade<4.5){
            result="Good";
        }else if(grade>=4.5&&grade<5.5){
            result="Very good";
        }else if(grade>=5.5&&grade<=6){
            result="Excellent";
        }
        System.out.println(result);
    }
}
