package Lecutre6ObjectAndClasses.exersiceObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.",
                "I can’t live without this product."};

        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};


        for (int i = 0; i < input; i++) {
            Random random = new Random();
            int p = random.nextInt(phrases.length);
            int e = random.nextInt(events.length);
            int a = random.nextInt(authors.length);
            int c = random.nextInt(cities.length);

            System.out.printf("%s %s %s – %s.",phrases[p],events[e],authors[a],
                    cities[c]).println();
        }
    }
}
