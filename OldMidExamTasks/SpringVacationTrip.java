package ExamsTasks;

import java.util.Scanner;

public class SpringVacationTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int peopleNum = Integer.parseInt(scanner.nextLine());
        double fuelPriceForOneKm = Double.parseDouble(scanner.nextLine());
        double foodExpensesForPerson = Double.parseDouble(scanner.nextLine());
        double priceForRoomForOneGuy = Double.parseDouble(scanner.nextLine());

        double foodExpensesForAll = days * peopleNum * foodExpensesForPerson;
        double hotelPriceForAll = days * peopleNum * priceForRoomForOneGuy;

        if (peopleNum > 10) {
            hotelPriceForAll *= 0.75;
        }

        double currentExpenses = foodExpensesForAll + hotelPriceForAll;

        for (int i = 1; i <= days; i++) {
            double distanceForOneDay = Double.parseDouble(scanner.nextLine());

            currentExpenses += (distanceForOneDay * fuelPriceForOneKm);

            if (i % 3 == 0 || i % 5 == 0) {
                currentExpenses += currentExpenses * 0.4;
            }
            if (i % 7 == 0) {
                currentExpenses -= (currentExpenses / peopleNum);
            }

            if (currentExpenses > budget) {
                System.out.printf("Not enough money to continue the trip. You need %.2f$ more.",
                        currentExpenses - budget);
                return;
            }
        }
        System.out.printf("You have reached the destination. You have %.2f$ budget left.",
                budget - currentExpenses);
    }
}
