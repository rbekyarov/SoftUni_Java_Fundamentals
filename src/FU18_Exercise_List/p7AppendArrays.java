package FU18_Exercise_List;

import java.util.Scanner;

public class p7AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // String input = scanner.nextLine();
        String [] input = scanner.nextLine().split("\\|");
        String result ="";
        for (int i = input.length-1; i >=0 ; i--) {
            result =" "+result+ input[i]+" ";

        }
        String [] input2 = result.split("\\s+");
        for (int i = 0; i <=input2.length-1 ; i++) {
            System.out.print(input2[i]+" ");
        }


        
    }
}
