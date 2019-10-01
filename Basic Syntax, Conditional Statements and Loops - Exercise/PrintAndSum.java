package Lecture1;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = numOne; i <= numTwo ; i++) {
            sum += i;
            System.out.print(i+ " ");
        }
        System.out.printf("\nSum: %d",sum);
    }
}
