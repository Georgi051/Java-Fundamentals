package Lecture4Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(result(num));
    }
    static int result (int num){
        int evenSum = 0;
        int oddSum = 0;
        while (num !=0 ){
            int lastDigit = num % 10;
            num /= 10;
            if (lastDigit % 2 == 0){
                evenSum += lastDigit;
            }else {
                oddSum += lastDigit;
            }
        }
        return Math.abs(evenSum * oddSum);
    }
}
