package OldFinalExamTasks;

import java.util.*;

public class VaporWinterSale_NestedMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(", ");

        Map<String, Double> gameBook = new LinkedHashMap<>();
        Map<String, Map<String, Double>> gamesWithDcl = new LinkedHashMap<>();

        for (int i = 0; i < data.length; i++) {

            if (data[i].contains("-")) {
                String[] input = data[i].split("-");
                String name = input[0];
                double price = Double.parseDouble(input[1]);
                if (!gameBook.containsKey(name)) {
                    gameBook.put(name, price);
                }
            } else {
                String[] input = data[i].split(":");
                String name = input[0];
                String dcl = input[1];
                if (gameBook.containsKey(name)) {
                    Map<String, Double> dclGame = new LinkedHashMap<>();
                    double gameValue = gameBook.get(name) * 1.2;
                    dclGame.put(dcl, gameValue);
                    gamesWithDcl.put(name, dclGame);
                    gameBook.remove(name);
                }
            }
        }
        Map<String, List<String>> dclGame = new LinkedHashMap<>();

        for (Map.Entry<String, Map<String, Double>> stringMapEntry : gamesWithDcl.entrySet()) {
            String key = stringMapEntry.getKey();
            for (Map.Entry<String, Double> value : stringMapEntry.getValue().entrySet()) {
                String dcl = value.getKey();
                double newValue = value.getValue() * 0.5;
                List<String> outputData = new ArrayList<>();
                outputData.add(dcl);
                outputData.add(String.valueOf(newValue));
                dclGame.put(key, outputData);
            }
        }

        dclGame.entrySet().stream().sorted((f, s) -> {
            double first = Double.parseDouble(f.getValue().get(1));
            double sec = Double.parseDouble(s.getValue().get(1));
            return Double.compare(first, sec);
        }).forEach(entry ->
                System.out.printf("%s - %s - %.2f\n", entry.getKey(),
                        entry.getValue().get(0),
                        Double.parseDouble(entry.getValue().get(1))));

        for (Map.Entry<String, Double> entry : gameBook.entrySet()) {
            double newValue = entry.getValue() * 0.8;
            gameBook.put(entry.getKey(), newValue);
        }

        gameBook.entrySet().stream().sorted((e1, e2) ->
                e2.getValue().compareTo(e1.getValue())
        ).forEach(entry -> System.out.printf("%s - %.2f\n", entry.getKey(), entry.getValue()));
    }
}
