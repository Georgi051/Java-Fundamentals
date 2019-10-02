package Lacture2;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstCharacter = Integer.parseInt(scanner.nextLine());
        int secondCharacter = Integer.parseInt(scanner.nextLine());

        for (int i = firstCharacter; i <= secondCharacter; i++) {
            char character = (char)i;
            System.out.print(character + " ");
        }
    }
}
