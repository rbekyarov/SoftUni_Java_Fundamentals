package FU17_Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p1SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers  = scanner.nextLine();
        List<Double> num = Arrays.stream(numbers.split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        for (int i = 0; i <num.size()-1 ; i++) {
            if(num.get(i).equals(num.get(i+1))){
               double sum = num.get(i)+ num.get(i+1);
              num.set(i,sum);
              num.remove(i+1);
              i=-1;//зануляваме за да почнем от начало
            }
        }
        DecimalFormat decimal = new DecimalFormat("0.#");
        for (double decimalNum:num){
            System.out.print(decimal.format(decimalNum)+" ");
        }

    }
}
