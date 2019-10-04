package Lecture4Methods.exersise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(printMiddleChar(input));
    }

    static String printMiddleChar(String word) {
        int character = 0;
        int position = 0;

        if (word.length() % 2 == 0) {
            character = word.length() / 2 - 1;
            position = 2;
        } else {
            character = word.length() / 2;
            position = 1;
        }

        return word.substring(character, character + position);
    }
}
