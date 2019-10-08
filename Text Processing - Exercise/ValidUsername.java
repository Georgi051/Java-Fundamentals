package Lecutre8TextProcessing.exersice;

import java.util.Scanner;

public class ValidUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(", ");

        for (String word : text) {
            if (wordCheck(word)){
                System.out.println(word);
            }
        }
    }
    private static boolean wordCheck(String word) {

        if (word.length() < 3 || word.length() > 16){
            return  false;
        }

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (!Character.isLetterOrDigit(letter) &&  letter != '_' && letter != '-'){
                return false;
            }
        }
        return true;
    }
}
