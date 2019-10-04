package Lecture4Methods;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        PrintResult(grade);
    }

     static void PrintResult(double grade) {
        if (grade >= 2.00 && grade <= 3.00) {
            System.out.println("Fail");
        } else if (grade >= 3.00 && grade < 3.50) {
            System.out.println("Poor");
        }else if (grade >= 3.50 && grade < 4.50) {
            System.out.println("Good");
        }else if (grade >= 4.50 && grade < 5.50) {
            System.out.println("Very good");
        }else if (grade >= 5.50 && grade <= 6.00) {
            System.out.println("Excellent");
        }
    }
}
