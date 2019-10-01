package Lecture1;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        String number = "";
        int num = n % 10;

        if (num == 1) {
            number = "one";
        } else if (num == 2) {
            number = "two";
        } else if (num == 3) {
            number = "three";
        } else if (num == 4) {
            number = "four";
        } else if (num == 5) {
            number = "five";
        } else if (num == 6) {
            number = "six";
        } else if (num == 7) {
            number = "seven";
        } else if (num == 8) {
            number = "eight";
        } else if (num == 9) {
            number = "nine";
        }else if (num == 0){
            System.out.println("zero");
        }

        System.out.println(number);
    }
}
