package Lacture2;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pounds = Double.parseDouble(scanner.nextLine());

        double toDollars =  pounds * 1.31;

        System.out.printf("%.3f",toDollars);
    }
}
