package Lecture4Methods.exersise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        System.out.println(printVowels(input));

    }
    static int printVowels(String word){
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char characher = word.charAt(i);
            if(characher == 'a' || characher == 'e'|| characher == 'i'
                    || characher == 'o'|| characher == 'u'){
                count++;
            }
        }
        return count;
    }
}
