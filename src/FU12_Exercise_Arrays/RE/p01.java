package FU12_Exercise_Arrays.RE;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  wagons = Integer.parseInt(scanner.nextLine());
        int [] peoples = new int[wagons];
        int sum = 0;
        for (int i = 0; i <peoples.length ; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            sum +=people;
          peoples[i]=people;
        }
        for(int people :peoples){
            System.out.print( people+" ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
