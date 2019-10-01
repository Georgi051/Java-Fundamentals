package Lecture1;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPeople = Integer.parseInt(scanner.nextLine());
        String typeGroupPeople = scanner.nextLine();
        String day = scanner.nextLine();

        if (numPeople >= 100 && typeGroupPeople.equals("Business")) {
            numPeople -= 10;
        }
        double price = 0.0;
        switch (typeGroupPeople) {
            case "Students":
                if ("Friday".equals(day)) {
                    price = numPeople * 8.45;
                } else if ("Saturday".equals(day)) {
                    price = numPeople * 9.80;
                } else if ("Sunday".equals(day)) {
                    price = numPeople * 10.46;
                }
                if (numPeople >= 30) {
                    price *= 0.85;
                }
                break;
            case "Business":
                if ("Friday".equals(day)) {
                    price = numPeople * 10.90;
                } else if ("Saturday".equals(day)) {
                    price = numPeople * 15.60;
                } else if ("Sunday".equals(day)) {
                    price = numPeople * 16;
                }
                break;
            case "Regular":
                if ("Friday".equals(day)) {
                    price = numPeople * 15;
                } else if ("Saturday".equals(day)) {
                    price = numPeople * 20;
                } else if ("Sunday".equals(day)) {
                    price = numPeople * 22.50;
                }
                if (numPeople >= 10 && numPeople <= 20){
                    price *= 0.95;
                }
                break;
        }
        System.out.printf("Total price: %.2f", price);
    }
}
