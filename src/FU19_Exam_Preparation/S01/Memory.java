package FU19_Exam_Preparation.S01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Memory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> twins = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int counter = 0;
        String commands = scanner.nextLine();
        while (!commands.equals("end")) {
            counter++;
            int[] command = Arrays.stream(commands.split(" ")).mapToInt(Integer::parseInt).toArray();
            int index1 = command[0];
            int index2 = command[1];
            if (index1 < 0 || index2 < 0 || index1 > twins.size() || index2 > twins.size()) {
                twins.add(twins.size() / 2, "-" + counter + "a");
                twins.add(twins.size() / 2, "-" + counter + "a");
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                if (twins.get(index1).equals(twins.get(index2))) {
                    System.out.printf("Congrats! You have found matching elements - %s!\n", twins.get(index1));
                    twins.remove(index1);
                    if(twins.size()==1){
                        twins.remove(index1);
                    }
                    else if (index2-index1==-1||index2-index1==1){
                        twins.remove(index2);
                    }else {
                        twins.remove(index2-1);
                    }


                } else {
                    System.out.println("Try again!");
                }

            }
            if (twins.size() == 0) {
                System.out.printf("You have won in %d turns!", counter);
                return;
            }
            commands = scanner.nextLine();
        }
        System.out.println("Sorry you lose :(");
        for (int i = 0; i < twins.size(); i++) {
            System.out.print(twins.get(i) + " ");

        }
    }
}
