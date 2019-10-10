package ExamsTasks;

import java.util.Scanner;

public class DungeonestDark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int coins = 0;
        int countRoom = 0;
        String[] input = scanner.nextLine().split("[|]");

        for (int i = 0; i < input.length; i++) {
            countRoom++;
            String[] monsterAndNum = input[i].split(" ");
            String item = monsterAndNum[0];
            int num = Integer.parseInt(monsterAndNum[1]);

            if (item.equals("potion")) {
                if (health + num <= 100) {
                    health += num;
                    System.out.printf("You healed for %d hp.\n", num);
                    System.out.printf("Current health: %d hp.\n", health);
                    continue;
                } else {
                    System.out.printf("You healed for %d hp.\n", 100 - health);
                    health = 100;
                }
                System.out.printf("Current health: %d hp.\n", health);
            } else if (item.equals("chest")) {
                coins += num;
                System.out.printf("You found %d coins.\n", num);
            } else {
                health -= num;
                if (health <= 0) {
                    System.out.printf("You died! Killed by %s.\n", item);
                    System.out.printf("Best room: %d", countRoom);
                    return;
                } else {
                    System.out.printf("You slayed %s.\n", item);
                }
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Coins: %d\n", coins);
        System.out.printf("Health: %d", health);
    }
}
