package FU22_Exercise_Objects_and_Classes.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleInput = scanner.nextLine();
        String[] articleData = articleInput.split(", ");
        String title = articleData[0];
        String content = articleData[1];
        String author = articleData[2];
        Articles article = new Articles(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String commands = scanner.nextLine();
            String[] commandsData = commands.split(": ");
            String commandName = commandsData[0];
            String parameters = commandsData[1];

            switch (commandName) {
                case "Edit"://викаме методите
                    article.edit(parameters);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(parameters);
                    break;
                case "Rename":
                    article.rename(parameters);
                    break;
            }
        }
           //викаме оверайднатия метод от класа
        System.out.println(article.toString());
    }
}
