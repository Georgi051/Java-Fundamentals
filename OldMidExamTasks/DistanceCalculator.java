package ExamsTasks.ExamTasks;

import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        double lenghtOneStep = Double.parseDouble(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());

        int longSteps = steps / 5;
        int normalSteps = steps - longSteps;

        double longLenghtStep = longSteps * (lenghtOneStep * 0.7);
        double normalLenghtStep = normalSteps * lenghtOneStep;

        double allDistance = (longLenghtStep + normalLenghtStep) / distance;

        System.out.printf("You travelled %.2f%% of the distance!",allDistance);
    }
}
