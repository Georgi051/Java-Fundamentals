package Lecutre7AssociativeArrays.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> usersBook = new HashMap<>();
        Map<String, Integer> languageBook = new HashMap<>();

        String input = scanner.nextLine();
        while (!"exam finished".equals(input)) {
            String[] data = input.split("-");
            String name = data[0];
            String language = data[1];

            if (input.contains("banned")) {
                usersBook.remove(name);
                input = scanner.nextLine();
                continue;
            }
            int currentPoints = Integer.parseInt(data[2]);

            if (!usersBook.containsKey(name)) {
                usersBook.put(name, currentPoints);
            } else {
                int points = usersBook.get(name);
                if (points < currentPoints) {
                    usersBook.put(name, currentPoints);
                }
            }

            if (!languageBook.containsKey(language)) {
                languageBook.put(language, 1);
            } else {
                int newCount = languageBook.get(language) + 1;
                languageBook.put(language, newCount);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        usersBook.entrySet().stream().sorted((e1, e2) -> {
            int sort = Integer.compare(e2.getValue(), e1.getValue());

            if (sort == 0) {
                sort = e1.getKey().compareTo(e2.getKey());
            }
            return sort;
        }).forEach(entry -> {
            System.out.println(String.format("%s | %d", entry.getKey(), entry.getValue()));
        });
        System.out.println("Submissions:");
        languageBook.entrySet().stream().sorted((e1, e2) -> {
            int sort = Integer.compare(e2.getValue(), e1.getValue());

            if (sort == 0) {
                sort = e1.getKey().compareTo(e2.getKey());
            }
            return sort;
        }).forEach(entry -> {
            System.out.println(String.format("%s - %d", entry.getKey(), entry.getValue()));
        });
    }
}
