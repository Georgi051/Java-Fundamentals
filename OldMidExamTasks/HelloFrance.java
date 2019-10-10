package ExamsTasks;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloFrance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] itemsWhitPrice = scanner.nextLine().split("[|]");

        double budget = Double.parseDouble(scanner.nextLine());

        List<Double> sumDouble = new ArrayList<Double>();
        double oldPrice = 0;
        double newPrice = 0;
        for (int i = 0; i < itemsWhitPrice.length; i++) {
            String[] splitProductsWhitPrice = itemsWhitPrice[i].split("->");

            String typeItem = splitProductsWhitPrice[0];
            double price = Double.parseDouble(splitProductsWhitPrice[1]);

            if (typeItem.equals("Clothes") && price <= 50.00){
                if (budget >= price){
                    oldPrice += price;
                    budget -= price;
                    price *= 1.40;
                    newPrice += price;
                    sumDouble.add(price);
                }
            }else if (typeItem.equals("Shoes") && price <= 35.00){
                if (budget >= price){
                    oldPrice += price;
                    budget -= price;
                    price *= 1.40;
                    newPrice += price;
                    sumDouble.add(price);
                }
            }else if (typeItem.equals("Accessories") && price <= 20.50){
                if (budget >= price){
                    oldPrice += price;
                    budget -= price;
                    price *= 1.40;
                    newPrice += price;
                    sumDouble.add(price);
                }
            }
        }
        budget += newPrice;
        double profit = newPrice - oldPrice;

        for (double sum : sumDouble) {
            System.out.printf("%.2f ",sum);
        }
        System.out.println();
        System.out.printf("Profit: %.2f\n",profit);

        if (budget >= 150){
            System.out.println("Hello, France!");
        }else {
            System.out.println("Time to go.");
        }
    }

}
