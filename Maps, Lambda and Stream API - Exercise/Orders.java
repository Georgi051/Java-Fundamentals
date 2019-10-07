package Lecutre7AssociativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String,Double> products = new LinkedHashMap<>();

        LinkedHashMap<String,Integer> dataProducts = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!"buy".equals(command)){
            String[] data = command.split("\\s+");
            String product = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            if (!products.containsKey(product)){
                products.put(product,price * quantity);
                dataProducts.put(product,quantity);
            }else {
                int newQuanity = dataProducts.get(product) + quantity;
                dataProducts.put(product,newQuanity);

                double newPrice = dataProducts.get(product) * price;
                products.put(product,newPrice);
            }
            command = scanner.nextLine();
        }
        

        products.entrySet().forEach(e -> System.out.printf("%s -> %.2f%n",e.getKey(),e.getValue()));
    }
}
