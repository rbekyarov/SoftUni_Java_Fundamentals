package FU19_Exam_Preparation.S05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inventory = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")){

            String [] tool = command.split(" - ");
            if (tool[0].equals("Drop")){
              inventory.remove(tool[1]);
            }
            if (tool[0].equals("Renew")){
                inventory.remove(tool[1]);
                inventory.add( tool[1]);
            }
            if (tool[0].equals("Collect")){
                inventory.add(tool[1]);
            }
            if (tool[0].equals("Combine Items")){
                String[] combine =  tool[1].split(":");
                String oldTool = combine[0];
                String newTool = combine[1];
                if (inventory.contains(oldTool)){
                    for (int i = 0; i <inventory.size(); i++) {
                        if(oldTool.equals(inventory.get(i))){
                            inventory.add(newTool);
                        }

                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.print(String.join(", ",inventory));
    }
}
