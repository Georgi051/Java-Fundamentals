package Lecture1;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        String comandOne = scanner.nextLine();
        while (!"Start".equals(comandOne)){
            double coins = Double.parseDouble(comandOne);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2){
                sum += coins;
            }else {
                System.out.printf("Cannot accept %.2f\n",coins);
            }
            comandOne = scanner.nextLine();
        }
        String comandTwo = scanner.nextLine();
        while (!"End".equals(comandTwo)){
            switch (comandTwo){
                case "Nuts":
                   if (sum >=2){
                       sum -= 2;
                       System.out.printf("Purchased %s\n",comandTwo);
                   }else {
                       System.out.println("Sorry, not enough money");
                   }
                    break;
                case "Water":
                    if (sum >=0.7){
                        sum -=0.7;
                        System.out.printf("Purchased %s\n",comandTwo);
                    }else {
                        System.out.println("Sorry, not enough money");

                    }
                    break;
                case "Crisps":
                    if (sum >=1.5){
                        sum -=1.5;
                        System.out.printf("Purchased %s\n",comandTwo);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sum >=0.8){
                        sum -=0.8;
                        System.out.printf("Purchased %s\n",comandTwo);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sum >=1){
                        sum -=1;
                        System.out.printf("Purchased %s\n",comandTwo);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                        break;
            }

            comandTwo = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",sum);

    }
}
