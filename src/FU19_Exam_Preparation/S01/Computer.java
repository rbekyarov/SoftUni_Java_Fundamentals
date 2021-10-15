package FU19_Exam_Preparation.S01;

import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if(input.equals("special")||input.equals("regular")){
            System.out.println("Invalid order!");
            return;
        }
        double sum = 0;
        while (!input.equals("special")&&!input.equals("regular")){

          double price = Double.parseDouble(input);
          if (price<0){
              System.out.println("Invalid price!");

          }else {
              sum +=price;
          }
            input = scanner.nextLine();
        }
        if(sum==0){
            System.out.println("Invalid order!" );
        }else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$\n",sum);
            System.out.printf("Taxes: %.2f$\n",sum*1.2-sum);
            if (input.equals("special")){
                sum = sum-sum*0.1;
            }
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$",sum*1.2);
        }
    }
}
