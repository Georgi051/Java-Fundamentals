package Lecture9Regex.exersice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0.0;
        String regex = "[>]+(?<name>[A-Za-z]+)<<(?<price>[-+]?\\d+\\.?\\d+)!(?<quantity>\\d*)\\b";
        String input = scanner.nextLine();

        System.out.println("Bought furniture:");
        while (!"Purchase".equals(input)){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()){
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                System.out.println(String.format("%s",name));
                double currentPrice = price * quantity;
                totalPrice += currentPrice;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total money spend: %.2f",totalPrice);
    }
}
