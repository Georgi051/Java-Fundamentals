package Lecture1;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());

        double spendingSum = 0;
        String command = scanner.nextLine();
        while (!"Game Time".equals(command)){
            switch (command){
                case "RoverWatch Origins Edition":
                case "OutFall 4":
                    if (currentBalance >= 39.99){
                        currentBalance -= 39.99;
                        spendingSum += 39.99;
                        System.out.printf("Bought %s\n",command);
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if (currentBalance >= 15.99){
                        currentBalance -= 15.99;
                        spendingSum += 15.99;
                        System.out.printf("Bought %s\n",command);
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (currentBalance >= 19.99){
                        currentBalance -= 19.99;
                        spendingSum += 19.99;
                        System.out.printf("Bought %s\n",command);
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (currentBalance >= 59.99){
                        currentBalance -= 59.99;
                        spendingSum += 59.99;
                        System.out.printf("Bought %s\n",command);
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (currentBalance >= 29.99){
                        currentBalance -= 29.99;
                        spendingSum += 29.99;
                        System.out.printf("Bought %s\n",command);
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;

            }

            if (currentBalance <= 0){
                System.out.println("Out of money!");
                break;
            }

            command = scanner.nextLine();
        }
        if (currentBalance >= 0){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",spendingSum,currentBalance);
        }
    }
}
