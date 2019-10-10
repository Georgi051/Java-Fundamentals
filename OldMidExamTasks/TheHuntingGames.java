package ExamsTasks;

import java.util.Scanner;

public class TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOfAdventure = Integer.parseInt(scanner.nextLine());
        int countPlayers = Integer.parseInt(scanner.nextLine());
        double groupEnergy = Double.parseDouble(scanner.nextLine());

        double waterPerDayForOnePerson = Double.parseDouble(scanner.nextLine());
        double foodPerDayForOnePerson = Double.parseDouble(scanner.nextLine());

        double totalWater = dayOfAdventure * countPlayers * waterPerDayForOnePerson;
        double totalFood = dayOfAdventure * countPlayers * foodPerDayForOnePerson;

        for (int i = 1; i <= dayOfAdventure; i++) {
            double wood = Double.parseDouble(scanner.nextLine());

            groupEnergy -= wood;

            if (groupEnergy <= 0) {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.",
                        totalFood, totalWater);
                return;
            }

            if (i % 2 == 0){
                groupEnergy *= 1.05;
                totalWater *= 0.70;
            }
            if (i % 3 == 0){
                groupEnergy *= 1.10;
                totalFood -= (totalFood / countPlayers);
            }
        }
        System.out.printf("You are ready for the quest. You will be left with - %.2f energy!",groupEnergy);
    }
}
