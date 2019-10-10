package OldFinalExamTasks;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VaporWinterSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        Map<String,Double> gameBook = new LinkedHashMap<>();
        Map<String,Double> gameWhitDlcBook = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {

            if (input[i].contains("-")){
                String[] data = input[i].split("-");
                String game = data[0];
                double price = Double.parseDouble(data[1]);
                gameBook.put(game,price);

            }else {
                String[] data = input[i].split(":");
                String name = data[0];
                String dlc = data[1];
                if (gameBook.containsKey(name)){
                    double newValue = gameBook.get(name) * 1.2;
                    gameWhitDlcBook.put(name + " - " + dlc,newValue);
                    gameBook.remove(name);
                }
            }
        }
        for (Map.Entry<String, Double> entry : gameWhitDlcBook.entrySet()) {
            double newValue = entry.getValue() * 0.5;
            gameWhitDlcBook.put(entry.getKey(),newValue);
        }

        for (Map.Entry<String, Double> entry : gameBook.entrySet()) {
            double newValue = entry.getValue() * 0.8;
            gameBook.put(entry.getKey(),newValue);
        }

        gameWhitDlcBook.entrySet().stream().sorted((e1,e2)->
                e1.getValue().compareTo(e2.getValue())
                ).forEach(entry -> System.out.printf("%s - %.2f\n",entry.getKey(),entry.getValue()));

        gameBook.entrySet().stream().sorted((e1,e2)->
                e2.getValue().compareTo(e1.getValue())
        ).forEach(entry -> System.out.printf("%s - %.2f\n",entry.getKey(),entry.getValue()));
    }
}
