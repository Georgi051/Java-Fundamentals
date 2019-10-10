package OldFinalExamTasks;

import java.util.*;

public class VaporWinterSale_WhitList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        Map<String, List<String>> gameBook = new LinkedHashMap<>();
        for (String item : input) {

            if (item.contains("-")) {
                String[] data = item.split("-");
                gameBook.put(data[0], new ArrayList<>());
                gameBook.get(data[0]).add(data[1]);

            } else {
                String[] data = item.split(":");
                String gameName = data[0];
                String dlc = data[1];
                if (gameBook.containsKey(gameName)) {
                    String value = gameBook.get(gameName).get(0);
                    double newValue = Double.parseDouble(value) * 1.2;
                    List<String> newData = new ArrayList<>();
                    newData.add(dlc);
                    newData.add(String.valueOf(newValue));
                    gameBook.put(gameName, newData);
                }
            }
        }
        for (Map.Entry<String, List<String>> entry : gameBook.entrySet()) {
            if (entry.getValue().size() == 1) {
                double newValue = Double.parseDouble(entry.getValue().get(0)) * 0.8;
                List<String> newList = new ArrayList<>();
                newList.add(String.valueOf(newValue));
                gameBook.put(entry.getKey(), newList);

            } else {
                String dlc = entry.getValue().get(0);
                String newValue = String.valueOf((Double.parseDouble(entry.getValue().get(1)) * 0.5));
                List<String> newData = new ArrayList<>();
                newData.add(dlc);
                newData.add(newValue);
                gameBook.put(entry.getKey(), newData);
            }
        }
        gameBook.entrySet().stream().filter(e -> e.getValue().size() > 1).sorted((f, s) -> {
            double first = Double.parseDouble(f.getValue().get(1));
            double sec = Double.parseDouble(s.getValue().get(1));
            return Double.compare(first, sec);
        }).forEach(entry ->
                System.out.printf("%s - %s - %.2f\n", entry.getKey(),
                        entry.getValue().get(0),
                        Double.parseDouble(entry.getValue().get(1))));

        gameBook.entrySet().stream().filter(e -> e.getValue().size() == 1).sorted((f, s) -> {
            double first = Double.parseDouble(f.getValue().get(0));
            double sec = Double.parseDouble(s.getValue().get(0));
            return Double.compare(sec, first);
        }).forEach(entry -> System.out.printf("%s - %.2f\n", entry.getKey(),
                Double.parseDouble(entry.getValue().get(0))));
    }
}
