package Lacture2.MoreExercise1;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numOne = Double.parseDouble(scanner.nextLine());
        double numTwo = Double.parseDouble(scanner.nextLine());
        double precision = 0.000001;

        if (Math.abs(numOne - numTwo) < precision){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
