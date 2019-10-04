package Lecture4Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f",printResult(product,quantity));
    }
    static double printResult(String product,int quantity){

        double result = 0;
        switch (product){
            case "coffee":
                result = 1.50 * quantity;
                break;
            case "water":
                result = 1.00 * quantity;
                break;
            case "coke":
                result = 1.40 * quantity;
                break;
            case "snacks":
                result = 2.00 * quantity;
                break;

        }
        return result;

    }
}
