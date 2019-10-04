package Lecture4Methods.exersise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean passLenght = lenghtChecker(input);
        boolean digitCheck = digitChecker(input);
        boolean digitAndWords = checkForDigitAndWords(input);
        if (passLenght && digitCheck && digitAndWords){
            System.out.println("Password is valid");
        }
        if (!passLenght){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!digitAndWords){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!digitCheck){
            System.out.println("Password must have at least 2 digits");
        }
    }

    static boolean lenghtChecker(String password) {
        boolean isTrue = false;
        if (password.length() >= 6 && password.length() <= 10) {
            isTrue = true;
        }
        return isTrue;
    }

    static boolean digitChecker(String password) {
        int count = 0;
        boolean isTrue = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))){
                count++;
            }
        }
        if (count >= 2) {
            isTrue = true;
        }
        return isTrue;
    }
    static boolean checkForDigitAndWords(String password) {
        boolean isTrue = true;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))){
                isTrue = false;
            }
        }
        return isTrue;
    }

}
