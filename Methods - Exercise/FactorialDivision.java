package Lecture4Methods.exersise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f",printFact(first,second));
    }
    static double printFact(int first ,int second){
        double factOne = 1;
        double factTwo = 1;
        for (int i = 1; i <= first; i++) {
            factOne *= i;
        }
        for (int i = 1; i <= second; i++) {
            factTwo *= i;
        }

        return factOne / factTwo;
    }
}
