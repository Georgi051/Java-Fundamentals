package Lecture9Regex.exersice;

import java.util.*;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(", ");
        Map<String, Integer> racerBook = new LinkedHashMap<>();

        for (int i = 0; i < names.length; i++) {
            if (!racerBook.containsKey(names[i])) {
                racerBook.put(names[i], 0);
            }
        }
        String command = scanner.nextLine();
        while (!"end of race".equals(command)) {
            StringBuilder name = new StringBuilder();
            StringBuilder playerDistance = new StringBuilder();
            for (int i = 0; i < command.length(); i++) {
                char letter = command.charAt(i);
                if (Character.isAlphabetic(letter)) {
                    name.append(letter);
                } else if (Character.isDigit(letter)) {
                    playerDistance.append(letter);
                }
            }
            if (racerBook.containsKey(name.toString())) {
                int sum = 0;
                for (int i = 0; i < playerDistance.length(); i++) {
                    char letter = playerDistance.charAt(i);
                    sum += Character.getNumericValue(letter);
                }
                int newValue = racerBook.get(name.toString()) + sum;
                racerBook.put(name.toString(), newValue);
            }
            command = scanner.nextLine();
        }

        List<String> topRacers = new LinkedList<>();

        racerBook.entrySet().stream().sorted((e1,e2)-> e2.getValue().compareTo(e1.getValue()))
                .limit(3).forEach(p -> topRacers.add(p.getKey()));

        System.out.printf("1st place: %s\n" + "2nd place: %s\n" + "3rd place: %s\n",
                topRacers.get(0), topRacers.get(1), topRacers.get(2));
    }
}
