package FU22_Exercise_Objects_and_Classes;

import java.util.*;

public class p1AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {


            String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
            String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
            String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
            String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
            Random random = new Random();
            int randomPhrases = random.nextInt(phrases.length);
            int randomEvents = random.nextInt(events.length);
            int randomAuthors = random.nextInt(authors.length);
            int randomCities = random.nextInt(cities.length);

            System.out.printf("%s %s %s – %s.\n", phrases[randomPhrases], events[randomEvents], authors[randomAuthors], cities[randomCities]);
        }
    }
}
