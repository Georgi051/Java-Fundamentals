package ExamsTasks.ExamTasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FroggySquad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> frogsList = Arrays.stream(scanner.nextLine().split("\\s+")).
                collect(Collectors.toList());


        while (true) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String typeComand = inputData[0];

            switch (typeComand) {

                case "Join":
                    if (!frogsList.contains(inputData[1])) {
                        frogsList.add(inputData[1]);
                    }
                    break;
                case "Jump":
                    String frog = inputData[1];
                    int inx = Integer.parseInt(inputData[2]);
                    if (indexCheck(frogsList, inx)) {
                        frogsList.add(inx, frog);
                    }
                    break;
                case "Dive":
                    int index = Integer.parseInt(inputData[1]);
                    if (indexCheck(frogsList, index)) {
                        frogsList.remove(index);
                    }
                    break;
                case "First":
                    int count = Integer.parseInt(inputData[1]);
                    if (count > frogsList.size()) {
                        String frogCount = String.valueOf(frogsList.subList(0, frogsList.size()));
                        System.out.println(frogCount.replaceAll("[\\[\\],]", ""));
                    } else {
                        String frogCount = String.valueOf(frogsList.subList(0, count));
                        System.out.println(frogCount.replaceAll("[\\[\\],]", ""));
                    }
                    break;
                case "Last":
                    int counts = Integer.parseInt(inputData[1]);
                    if (counts > frogsList.size()) {
                        String frogs = String.valueOf(frogsList.subList(0, frogsList.size()));
                        System.out.println(frogs.replaceAll("[\\[\\],]", ""));
                    } else {
                        String frogs = String.valueOf(frogsList.subList(frogsList.size() - counts, frogsList.size()));
                        System.out.println(frogs.replaceAll("[\\[\\],]", ""));
                    }
                    break;
                case "Print":
                    String type = inputData[1];
                    switch (type) {
                        case "Normal":
                            System.out.print("Frogs: ");
                            System.out.print(String.join(" ", frogsList));
                            return;
                        case "Reversed":
                            System.out.print("Frogs: ");
                            Collections.reverse(frogsList);
                            System.out.print(String.join(" ", frogsList));
                            return;
                    }
                    break;
            }
        }
    }

    static boolean indexCheck(List<String> frogsList, int inx) {
        if (inx >= 0 && inx < frogsList.size()) {
            return true;
        } else {
            return false;
        }
    }
}
