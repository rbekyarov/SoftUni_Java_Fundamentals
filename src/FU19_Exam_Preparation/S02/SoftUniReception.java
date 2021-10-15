package FU19_Exam_Preparation.S02;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employee1 = Integer.parseInt(scanner.nextLine());
        int employee2 = Integer.parseInt(scanner.nextLine());
        int employee3 = Integer.parseInt(scanner.nextLine());
        int clientsTotal = Integer.parseInt(scanner.nextLine());

        int clientsForHour = employee1+employee2+employee3;
        int hours=0;

        while (clientsTotal>0){
            hours++;
            if(hours%4==0){
                continue;
            }
            clientsTotal-=clientsForHour;
        }
        System.out.printf("Time needed: %dh.",hours);
    }
}
