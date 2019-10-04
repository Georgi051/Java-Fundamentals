package Lecture4Methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f",area(width,height));
    }

     static double area(double width, double height) {
        double result = width * height;
        return result;
    }
}
