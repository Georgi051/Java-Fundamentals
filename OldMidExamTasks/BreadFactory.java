package ExamsTasks;

import java.util.Scanner;

public class BreadFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] workingDayEvents = scanner.nextLine().split("[|]");

        int startedEnergy = 100;
        int startedCoins = 100;

        for (int i = 0; i < workingDayEvents.length; i++) {
            String[] dayEvent = workingDayEvents[i].split("-");
            String commandOrProduct = dayEvent[0];
            int count = Integer.parseInt(dayEvent[1]);

            if (commandOrProduct.equals("rest")) {
                if (startedEnergy == 100) {
                    System.out.println("You gained 0 energy.");
                    System.out.println("Current energy: 100.");
                } else if (startedEnergy + count > 100) {
                    System.out.printf("You gained %d energy.\n", count);
                    System.out.printf("Current energy: %d.\n",startedEnergy);
                } else {
                    startedEnergy += count;
                    System.out.printf("You gained %d energy.\n", count);
                    System.out.printf("Current energy: %d.\n",startedEnergy);
                }
            } else if (commandOrProduct.equals("order")) {
                if (startedEnergy >= 30){
                    startedEnergy -= 30;
                    startedCoins += count;
                    System.out.printf("You earned %d coins.\n", count);
                }else {
                    startedEnergy += 50;
                    System.out.println("You had to rest!");
                }
            } else {
                if (startedCoins - count > 0) {
                    startedCoins -= count;
                    System.out.printf("You bought %s.\n", commandOrProduct);
                } else {
                    System.out.printf("Closed! Cannot afford %s.",commandOrProduct);
                    return;
                }
            }
        }
        System.out.println("Day completed!");
        System.out.printf("Coins: %d\n", startedCoins);
        System.out.printf("Energy: %d", startedEnergy);
    }
}
