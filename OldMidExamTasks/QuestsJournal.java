package ExamsTasks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuestsJournal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!"Retire!".equals(command)) {
            String[] inputData = command.split(" - ");
            String typeComand = inputData[0];


            switch (typeComand) {
                case "Start":
                    String questS = inputData[1];
                    if (!(input.contains(questS))) {
                        input.add(questS);
                    }
                    break;
                case "Complete":
                    String questC = inputData[1];
                    if (input.contains(questC)) {
                        input.remove(questC);
                    }
                    break;
                case "Side Quest":
                    String[] questAndsideQuest = inputData[1].split(":");
                    String quest = questAndsideQuest[0];
                    String sideQuest = questAndsideQuest[1];
                    if (input.contains(quest)) {
                        if (!(input.contains(sideQuest))) {
                            input.add(input.indexOf(quest),sideQuest);
                            input.remove(quest);
                            input.add(input.indexOf(sideQuest),quest);
                        }
                    }
                    break;
                case "Renew":
                    String questR = inputData[1];
                    if (input.contains(questR)) {
                        input.remove(questR);
                        input.add(questR);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < input.size(); i++) {
            if (i == input.size() - 1) {
                System.out.printf("%s", input.get(i));
            } else {
                System.out.printf("%s, ", input.get(i));
            }
        }
    }
}
