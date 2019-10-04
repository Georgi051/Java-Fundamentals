package Lecture4Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type){
            case "int":
                int numOne = Integer.parseInt(scanner.nextLine());
                int numTwo = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(numOne,numTwo));
               break;
            case "char":
                char one = scanner.nextLine().charAt(0);
                char two = scanner.nextLine().charAt(0);
                System.out.println(getMax(one,two));
                break;
            case "string":
                String wordOne = scanner.nextLine();
                String wordTwo = scanner.nextLine();
                System.out.println(getMax(wordOne,wordTwo));
                break;
        }

    }
    static  int getMax (int numOne , int numTwo){
        if (numOne > numTwo){
            return numOne;
        }
        return numTwo;
    }

    static char getMax(char one , char two){
        if (one > two){
            return  one;
        }
        return two;
    }
    static String getMax (String wordOne,String wordTwo){
        if (wordOne.compareTo(wordTwo) >= 0){
            return wordOne;
        }
        return wordTwo;
    }
}
