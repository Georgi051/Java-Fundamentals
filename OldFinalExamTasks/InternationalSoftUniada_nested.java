package OldFinalExamTasks;

import java.util.*;

public class InternationalSoftUniada_nested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> dataBook = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!"END".equals(command)) {
            String[] input = command.split(" -> ");
            String country = input[0];
            String name = input[1];
            int points = Integer.parseInt(input[2]);

            if (!dataBook.containsKey(country)) {
                dataBook.put(country, new LinkedHashMap<>());
                dataBook.get(country).put(name, points);
            } else {
                Map<String, Integer> newContestInfo = dataBook.get(country);
                if (newContestInfo.containsKey(name)) {
                    newContestInfo.put(name, newContestInfo.get(name) + points);
                    dataBook.put(country, newContestInfo);
                } else {
                    newContestInfo.put(name, points);
                    dataBook.put(country, newContestInfo);
                }
            }
            command = scanner.nextLine();
        }
        Map<String, Integer> countryPoints = new LinkedHashMap<>();
        for (Map.Entry<String, Map<String, Integer>> allCountrysInfo : dataBook.entrySet()) {
            int sumPointsForCounty = 0;
            for (Map.Entry<String, Integer> entry : allCountrysInfo.getValue().entrySet()) {
                sumPointsForCounty += entry.getValue();
            }
            countryPoints.put(allCountrysInfo.getKey(), sumPointsForCounty);
        }
        dataBook.entrySet().stream().sorted((fKvp, sKvp) ->
                Integer.compare(countryPoints.get(sKvp.getKey()), countryPoints.get(fKvp.getKey()))
        ).forEach(kvp -> {
            System.out.printf("%s: %d\n", kvp.getKey(), countryPoints.get(kvp.getKey()));

            kvp.getValue().forEach((k, v) -> System.out.printf("-- %s -> %d\n", k, v));
        });
    }
}
