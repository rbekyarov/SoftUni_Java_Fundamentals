package FU19_Exam_Preparation.S01;

import java.util.Arrays;
import java.util.Scanner;

public class Lift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isEmptySpot = false;
        for (int i = 0; i < wagons.length; i++) {

            if (wagons[i]==4){
                continue;
            }
            int tempPeople = 4 - wagons[i];
            if(tempPeople<people){
                people -= tempPeople;
                wagons[i] = tempPeople + wagons[i];
            }else {
                wagons[i]=people;
                people -= tempPeople;
                isEmptySpot = true;
            }
            if (people<1){
                break;
            }

        }
        if (isEmptySpot){
            System.out.println("The lift has empty spots!");
        } else if (people>0){
            System.out.printf("There isn't enough space! %d people in a queue!\n",people);
        }
        for (int wagon:wagons){
            System.out.print(wagon+" ");
        }
    }
}
