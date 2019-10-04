package Lecture4Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        switch (command){
            case "add":
                printAddResult(numOne,numTwo);
                break;
            case "multiply":
                printMultiplyResult(numOne,numTwo);
                break;
            case "subtract":
                printSubtractResult(numOne,numTwo);
                break;
            case "divide":
                printDivideResult(numOne,numTwo);
                break;

        }
    }
    static void printAddResult(int numOne,int numTwo){
        System.out.println(numOne + numTwo);
    }
    static void printMultiplyResult(int numOne,int numTwo){
        System.out.println(numOne * numTwo);
    }
    static void printSubtractResult(int numOne,int numTwo){
        System.out.println(numOne - numTwo);
    }
    static void printDivideResult(int numOne,int numTwo){
        System.out.println(numOne / numTwo);
    }
}
