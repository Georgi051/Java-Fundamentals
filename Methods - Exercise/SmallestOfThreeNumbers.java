package Lecture4Methods.exersise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());

        if (biggerNumPrint(one,two) < three){
            System.out.println(biggerNumPrint(one,two));
        }else {
            System.out.println(three);
        }

    }
    static int biggerNumPrint(int one,int two){
        if (one < two){
            return one;
        }
        return two;
    }
}
