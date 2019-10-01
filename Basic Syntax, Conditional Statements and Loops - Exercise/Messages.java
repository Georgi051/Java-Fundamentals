package Lecture1;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordLong = Integer.parseInt(scanner.nextLine());

        String massage = "";

        for (int i = 0; i < wordLong; i++) {
            String digits = scanner.nextLine();
            int digitsLenght = digits.length();
            char firstDigit = digits.charAt(0);
            int mainDigit = Character.getNumericValue(firstDigit);
            int offset = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9){
                offset = (mainDigit - 2) * 3 + 1;
            }

            int letterIndex = (offset + digitsLenght - 1);
            int letterCode =  letterIndex + 97;

            char letter  = (char)letterCode;
            if (mainDigit == 0){
                letter = (char)(mainDigit + 32);
            }
            massage += letter;
        }
        System.out.println(massage);
    }
}
