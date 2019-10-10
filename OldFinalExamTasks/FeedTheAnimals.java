package OldFinalExamTasks;

import java.util.*;

public class FeedTheAnimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> animalNameAndFood = new LinkedHashMap<>();
        Map<String, Integer> animalArea = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!"Last Info".equals(command)) {
            String[] input = command.split(":");
            String typeCommand = input[0];
            String animalName = input[1];
            String area = input[3];

            if (typeCommand.equals("Add")) {
                int dailyFood = Integer.parseInt(input[2]);
                if (!animalNameAndFood.containsKey(animalName)) {
                    animalNameAndFood.put(animalName, dailyFood);
                    if (!animalArea.containsKey(area)) {
                        animalArea.put(area, 1);
                    } else {
                        int areaCount = animalArea.get(area) + 1;
                        animalArea.put(area, areaCount);
                    }
                } else {
                    int newValue = animalNameAndFood.get(animalName) + dailyFood;
                    animalNameAndFood.put(animalName, newValue);
                }
            } else if (typeCommand.equals("Feed")) {
                int food = Integer.parseInt(input[2]);

                if (animalNameAndFood.containsKey(animalName)) {
                    int foodValue = animalNameAndFood.get(animalName) - food;
                    animalNameAndFood.put(animalName, foodValue);
                    if (foodValue <= 0) {
                        animalNameAndFood.remove(animalName);
                        int numArea = animalArea.get(area);
                        if (numArea > 1) {
                            numArea -= 1;
                            animalArea.put(area, numArea);
                        } else {
                            animalArea.remove(area);
                        }
                        System.out.printf("%s was successfully fed\n", animalName);
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("Animals:");
        animalNameAndFood.entrySet().stream().sorted((e1, e2) -> {
            int sort = e2.getValue().compareTo(e1.getValue());
            if (sort == 0) {
                sort = e1.getKey().compareTo(e2.getKey());
            }
            return sort;
        }).forEach(animal -> System.out.printf("%s -> %dg\n", animal.getKey(),
                animal.getValue()));
        System.out.println("Areas with hungry animals:");
        animalArea.entrySet().stream().sorted((area1, area2) ->
                area2.getValue().compareTo(area1.getValue())
        ).forEach(entry -> System.out.printf("%s : %d\n", entry.getKey(),
                entry.getValue()));
    }
}
