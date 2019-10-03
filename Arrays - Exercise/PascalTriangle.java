package Lacture3Arrays.exercise;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        printPascal(input);
    }

    static void printPascal(int n){
        for (int line = 0; line < n; line++) {
            for (int i = 0; i <= line; i++){
                System.out.print(binomialCoeff(line, i)+" ");
            }
            System.out.println();
        }
    }
    static int binomialCoeff(int one, int two){
        int res = 1;
        if (two > one - two){
            two = one - two;
        }
        for (int i = 0; i < two; ++i) {
            res *= (one - i);
            res /= (i + 1);
        }
        return res;
    }
}

