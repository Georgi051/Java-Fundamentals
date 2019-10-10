package OldFinalExamTasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnimalSanctuary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String regex = ":([^;]+);t:([^;]+);c--([\\sA-Za-z]+)$";
        Pattern pattern = Pattern.compile(regex);
        int kg = 0;
        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            String name = "";
            String kind = "";

            while (matcher.find()) {
                String animalName = matcher.group(1);
                String animalKind = matcher.group(2);
                String animalCountry = matcher.group(3);

                for (int j = 0; j < animalName.length(); j++) {
                    char letter = animalName.charAt(j);
                    if (Character.isAlphabetic(letter) || Character.isWhitespace(letter)) {
                        name += letter;
                    } else if (Character.isDigit(letter)) {
                        kg += Character.getNumericValue(letter);
                    }
                }
                for (int j = 0; j < animalKind.length(); j++) {
                    char letter = animalKind.charAt(j);
                    if (Character.isAlphabetic(letter) || Character.isWhitespace(letter)) {
                        kind += letter;
                    } else if (Character.isDigit(letter)) {
                        kg += Character.getNumericValue(letter);
                    }
                }
                System.out.printf("%s is a %s from %s\n", name
                        , kind, animalCountry);
            }
        }
        System.out.printf("Total weight of animals: %dKG", kg);
    }
}
