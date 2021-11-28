package FU35_ExamPrep;

import java.util.Scanner;

public class p01_Activation_Keys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder activationKeys = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Generate")){
         String [] commandArr = command.split(">>>");
         String commandName = commandArr[0];

         switch (commandName){
             case "Contains":
                String substring = commandArr[1];
                if(activationKeys.toString().contains(substring)){
                    System.out.printf("%s contains %s",activationKeys,substring);
                }else {
                    System.out.println("Substring not found!");
                }
                 break;

             case "Flip":
               String subCommand = commandArr[1];
               int  startIndex = Integer.parseInt(commandArr[2]);
               int  endIndex = Integer.parseInt(commandArr[3]);
               String substr = activationKeys.substring(startIndex,endIndex);
                 if (subCommand.equals("Upper")){
                   String  theUpperString = substr.toUpperCase();
                     activationKeys.replace(startIndex,endIndex,theUpperString);
                     System.out.println(activationKeys);
                 }else{
                     String  theLowerString = substr.toLowerCase();
                     activationKeys.replace(startIndex,endIndex,theLowerString);
                     System.out.println(activationKeys);
                 }
                 break;
             case "Slice":
                 int  firstIndex = Integer.parseInt(commandArr[1]);
                 int  lastIndex = Integer.parseInt(commandArr[2]);
                 activationKeys.replace(firstIndex,lastIndex,"");
                 System.out.println(activationKeys);
                 break;
         }
            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n",activationKeys);
    }
}
