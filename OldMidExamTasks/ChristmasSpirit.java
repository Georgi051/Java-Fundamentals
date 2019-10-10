package ExamsTasks;

import java.util.Scanner;

public class ChristmasSpirit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int ornamentSet = 2 * quantity;
        int treeSkirt = 5 * quantity;
        int treeGarlands = 3 * quantity;
        int treeLights = 15 * quantity;

        int spirit = 0;
        int price = 0;

        for (int i = 1; i <= days; i++) {


            if (i % 11 == 0){
                quantity += 2;
                ornamentSet = 2 * quantity;
                treeSkirt = 5 * quantity;
                treeGarlands = 3 * quantity;
                treeLights = 15 * quantity;
            }

            if (i % 10 == 0){
                price += 23;
                spirit -= 20;
                if (days == i){
                    spirit -= 30;
                }
            }

            if (i % 5 == 0){
                price += treeLights;
                spirit += 17;
                if (i % 3 == 0){
                    spirit += 30;
                }
            }

            if (i % 3 == 0){
                price += treeSkirt;
                price += treeGarlands;
                spirit += 13;
            }

            if (i % 2 == 0){
                price += ornamentSet;
                spirit += 5;
            }
        }
        System.out.printf("Total cost: %d%n",price);
        System.out.printf("Total spirit: %d",spirit);
    }
}
