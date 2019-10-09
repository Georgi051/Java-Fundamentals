package Lecture9Regex.exersice;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> atackerPlanet = new TreeMap<>();
        Map<String, Integer> defencePlanet = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String operation = scanner.nextLine();
            String regex = "[STARstar]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(operation);
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            String currentData = "";
            for (int j = 0; j < operation.length(); j++) {
                char letter = (char) (operation.charAt(j) - count);
                currentData += letter;
            }

            String planetRegex = "@([A-Z][a-z]+)[^@\\-!:>]*:(\\d+)[^@\\-!:>]*!(A|D)![^@\\-!:>]*->*?(\\d+)";
            Pattern pattern1 = Pattern.compile(planetRegex);
            Matcher matcher1 = pattern1.matcher(currentData);

            while (matcher1.find()) {
                String planetName = matcher1.group(1);
                String aOrD = matcher1.group(3);

                if (aOrD.equals("A")) {
                    if (!atackerPlanet.containsKey(planetName)) {
                        atackerPlanet.put(planetName, 1);
                    }
                } else if (aOrD.equals("D")) {
                    if (!defencePlanet.containsKey(planetName)) {
                        defencePlanet.put(planetName, 1);
                    }
                }
            }
        }
        System.out.printf("Attacked planets: %d\n", atackerPlanet.values().size());
        atackerPlanet.forEach((key, value) -> System.out.printf("-> %s\n", key));
        System.out.printf("Destroyed planets: %d\n", defencePlanet.values().size());
        defencePlanet.forEach((key, value) -> System.out.printf("-> %s\n", key));
    }
}
