package ExamsTasks;

import java.util.Scanner;

public class EasterCozonacs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double flourPriceForOneKg = Double.parseDouble(scanner.nextLine());
        double eggsPrice = flourPriceForOneKg * 0.75;
        double milkPriceForLiter = flourPriceForOneKg * 1.25;
        double milkPriceForOneCozunac = milkPriceForLiter / 4;

        double priceForCozunac = flourPriceForOneKg + eggsPrice + milkPriceForOneCozunac;

        int cozunacCount = 0;
        int eggs = 0;
        while (budget >= priceForCozunac){
            budget -= priceForCozunac;
            cozunacCount++;
            eggs += 3;
            if (cozunacCount % 3 == 0){
                eggs -= (cozunacCount - 2);
            }
        }
        System.out.printf("You made %d cozonacs! Now you have %d eggs and %.2fBGN left.",
                cozunacCount,eggs,budget);
    }
}
