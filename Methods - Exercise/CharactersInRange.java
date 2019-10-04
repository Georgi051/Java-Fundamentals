package Lecture4Methods.exersise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char one = scanner.nextLine().charAt(0);
        char two = scanner.nextLine().charAt(0);

        printChars(one,two);
    }
    static void printChars (char a , char b){
        if (a < b){
            for (int i = a + 1; i < b; i++) {
                System.out.print((char) i + " ");
            }
        }else {
            for (int i = b + 1; i < a; i++) {
                System.out.print((char) i + " ");
            }
        }

    }
}
