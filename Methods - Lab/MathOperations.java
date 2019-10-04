package Lecture4Methods;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int numTwo = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f",calculations(numOne,operator,numTwo));

    }
    static double calculations (int numOne,String operator,int numTwo){
        double result = 0;
        switch (operator){
            case "-":
                result = numOne - numTwo;
                break;
            case "+":
                result = numOne + numTwo;
                break;
            case "*":
                result = numOne * numTwo;
                break;
            case "/":
                result = numOne / numTwo;
                break;
        }
        return result;
    }
}
