package FU18_Exercise_List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p6CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> cardsPlayer1 = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> cardsPlayer2 = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            Integer player1CurrentCard = cardsPlayer1.get(0);
            Integer player2CurrentCard = cardsPlayer2.get(0);

            if (player1CurrentCard.equals(player2CurrentCard)) {
                cardsPlayer1.remove(player1CurrentCard);
                cardsPlayer2.remove(player2CurrentCard);
            } else if (player1CurrentCard > player2CurrentCard) {
                cardsPlayer1.add(player1CurrentCard);
                cardsPlayer1.remove(player1CurrentCard);
                cardsPlayer1.add(player2CurrentCard);
                cardsPlayer2.remove(player2CurrentCard);
            } else {
                cardsPlayer2.add(player2CurrentCard);
                cardsPlayer2.remove(player2CurrentCard);
                cardsPlayer2.add(player1CurrentCard);
                cardsPlayer1.remove(player1CurrentCard);
            }
            if (cardsPlayer1.size() < 1) {
                int player2Sum = getSumOfCards(cardsPlayer2);
                System.out.printf("Second player wins! Sum: %d", player2Sum);
                break;
            } else if (cardsPlayer2.size() < 1) {
                int player1Sum = getSumOfCards(cardsPlayer1);
                System.out.printf("First player wins! Sum: %d", player1Sum);
                break;
            }
        }
    }

    private static int getSumOfCards(List<Integer> cards) {
        int sum = 0;
        for (Integer card : cards) {
            sum += card;
        }
        return sum;
    }
}
